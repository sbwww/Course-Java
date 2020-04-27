package chp6.homework.question1;

class Mammal{
	String name="furry";	
	String makeNoise(){ return "generic noise"; }
}

class Zebra extends Mammal{
	String name = "stripes";	
	String makeNoise(){ return "bray"; }
	String getName() { return "stripes"; }
}

public class ZooKeeper {
	public static void main(String[] args) {
		new ZooKeeper().go();
	}
	void go(){
		Mammal m = new Zebra();
		if(m instanceof Zebra) {
		    System.out.println(m.name+","+m.makeNoise());
		}
	}
}