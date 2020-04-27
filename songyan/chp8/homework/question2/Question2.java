package chp8.homework.question2;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		Map<ToDos, String> m = new HashMap<ToDos, String>();
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Monday");
		ToDos t3 = new ToDos("Tuesday");

		m.put(t1, "working");
		m.put(t2, "cleaning");
		m.put(t3, "playing");

		Set<ToDos> keys = m.keySet();
		Iterator<ToDos> it = keys.iterator();

		while (it.hasNext()) {
			ToDos key = (ToDos) it.next();
			String value = m.get(key);
			System.out.println(key.day + ":(" + value + ")");
		}

		System.out.println(t1.equals(t2));
		System.out.println(m.size());
		System.out.println(t1);
	}
}

class ToDos {
	String day;;

	ToDos(String day) {
		this.day = day;
	}

	public boolean equals(Object obj) {
		return ((ToDos) obj).day == day;
	}

	public int hashCode() {
		return 999; // answer is 3 after comment this
	}

}
