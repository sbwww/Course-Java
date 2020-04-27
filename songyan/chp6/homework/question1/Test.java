package chp6.homework.question1;

class A{
	public void methord(){
        System.out.println("A-m");
    }	
	public void methordA(){
        System.out.println("A-mA");
    }	
}

class B extends A{
	public void methord(){
        System.out.println("B-m");
    }	
	public void methordA(){
        System.out.println("B-mB");
    }	
}

public class Test {
	public static void main(String[] args) {
        A a=new B();
        a.methord();
	}
}