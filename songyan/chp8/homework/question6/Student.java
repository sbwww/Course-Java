// Student.java

package chp8.homework.question6;

import java.util.*;

public class Student {

	private String id;
	private int score;

	public Student() {
		id = new String();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter id: ");
		id = scanner.nextLine();
		System.out.println("Please enter score: ");
		score = scanner.nextInt();
		scanner.close();
	}

	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}
}
