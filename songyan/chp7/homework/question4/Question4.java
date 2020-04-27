package chp7.homework.question4;

import java.util.*;

public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int len = name.length();
		int cd = 0, cu = 0, cl = 0;
		for (int i = 0; i < len; ++i) {
			if (Character.isDigit(name.charAt(i)))
				++cd;
			else if (Character.isLowerCase(name.charAt(i)))
				++cl;
			else if (Character.isUpperCase(name.charAt(i)))
				++cu;
		}
		System.out.println("digit: " + cd + "\nlower: " + cl + "\nupper: " + cu);
		scanner.close();
	}
}