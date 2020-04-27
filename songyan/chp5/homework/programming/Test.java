package chp5.homework.programming;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		double a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a, b, c:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		if (a + b > c && b + c > a && c + a > b) {
			Triangle triangle = new Triangle(a, b, c);
			System.out.println(triangle/* .toString() */);
			System.out.println("side1=" + triangle.getSide1() + ", side2=" + triangle.getSide2() + ", side3="
					+ triangle.getSide3() + ", area=" + triangle.getArea() + ", perimeter=" + triangle.getPerimeter());
		} else {
			System.out.println("Enter a, b, c error.");
		}

		input.close();
	}
}
