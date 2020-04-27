// Test.java
package chp6.ex2;

public class Test {
	public static void main(String[] args){
		Application app=new Application();
		UserDaoForArray UDFA = new UserDaoForArray();
		app.setUserDao(UDFA);
		app.registe();
		app.login();
	}
}