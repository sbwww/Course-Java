package chp6.homework.question7;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Employee[] es = new Employee[5];
		es[0] = new Employee("001", "zhang", 5000);
		es[1] = new Employee("002", "li", 8000);
		es[2] = new Employee("003", "zhao", 6000);
		es[3] = new Employee("004", "song", 6500);
		es[4] = new Employee("005", "zhu", 9500);

		Arrays.sort(es);
		// System.out.println("Sorted by name");
		System.out.println("Sorted by salary");

		for (Employee e : es) {
			System.out.println(e/* .toString() */);
		}
	}
}
