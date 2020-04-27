// TrainSchedule.java

package chp8.homework.question3;

import java.text.*;
import java.util.*;

public class TrainSchedule {

	private List<Station> list;

	public TrainSchedule() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		int cnt;
		System.out.println("输入记录条数：");
		cnt = scanner.nextInt();
		list = new ArrayList<Station>(cnt);
		for (int i = 0; i < cnt; ++i) {
			System.out.println("输入第" + (i + 1) + "条信息：");
			String stopName = scanner.next();
			String arriveTime = scanner.next();
			int residenceTime = scanner.nextInt();
			Station s = new Station(stopName, sdf.parse(arriveTime), residenceTime);
			list.add(s);
		}
		scanner.close();
	}

	public TrainSchedule(List<Station> list) {
		this.list = list;
	}

	public void setList(List<Station> list) {
		this.list = list;
	}

	public List<Station> getList() {
		return this.list;
	}

	public void showList() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Station s = new Station();
		for (int i = 0; i < list.size(); ++i) {
			s = list.get(i);
			System.out.println(
					s.getStopName() + "\t到站时间：" + sdf.format(s.getArriveTime()) + "\t停车时间：" + s.getResidenceTime());
		}
		// Iterator<Station> it=list.iterator();
		// while(!)
	}
}

class Station {
	private String stopName;
	private Date arriveTime;
	private int residenceTime;

	public Station() {

	}

	public Station(String stopName, Date arriveTime, int residenceTime) {
		this.stopName = stopName;
		this.arriveTime = arriveTime;
		this.residenceTime = residenceTime;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	public void setResidenceTime(int residenceTime) {
		this.residenceTime = residenceTime;
	}

	public String getStopName() {
		return this.stopName;
	}

	public Date getArriveTime() {
		return this.arriveTime;
	}

	public int getResidenceTime() {
		return this.residenceTime;
	}
}
