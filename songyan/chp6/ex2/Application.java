// Application.java
package chp6.ex2;

import java.util.Scanner;

public class Application {
	private UserDaoForArray UDFA;

	public Application() {

	}

	public void setUserDao(UserDaoForArray UDFA) {
		this.UDFA = UDFA;
	}

	public void registe() {
		boolean flag = false; // Not yet registered
		Scanner scanner = new Scanner(System.in);
		while (!flag) {
			System.out.println("******User Register******");
			System.out.println("Please enter username: ");
			String userName = scanner.nextLine();
			System.out.println("Please enter password: ");
			String password1 = scanner.nextLine();
			System.out.println("Please enter password again: ");
			String password2 = scanner.nextLine();
			if (!password1.equals(password2)) {
				System.out.println("Password not consistent, please enter again!");
			} else {
				User user = new User(userName, password1);
				this.UDFA.addUser(user);
				System.out.println(userName + " register successful!");
				flag = true;
			}
		}
		// scanner.close(); // Scanner关闭后无法在同一循环打开
	}

	public void login() {
		boolean flag = false; // Not yet login
		Scanner scanner = new Scanner(System.in);
		while (!flag) {
			System.out.println("******User Login******");
			System.out.println("Please enter username: ");
			String userName = scanner.nextLine();
			System.out.println("Please enter password: ");
			String password = scanner.nextLine();
			if (this.UDFA.getUser(userName, password) == null) {
				System.out.println("Wrong username or password, please enter again!");
			} else {
				System.out.println(userName + " login successful!");
				flag = true;
			}
		}
		// scanner.close();
	}
}
