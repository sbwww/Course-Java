package chp3.ex2;

import java.util.Scanner;

/***
 * 
 * ѧ���ɼ���ѯϵͳ
 *
 */
public class ScoreMIS {
	static final int STUDENT_NUM = 6;
	static final int COURSE_NUM = 5;

	static String[] students = { "zhang", "wang", "li", "zhao", "liu", "song", "Average" };
	static String[] courses = { "C", "Java", "mySQL", "Linux", "HTML", "Average" };
	static double[][] score = new double[STUDENT_NUM + 1][COURSE_NUM + 1];

	public static void main(String[] args) {
		System.out.println("Begin!");
		initScore(); // ��ʼ��ѧ���ɼ�
		show(); // ��ʾ�γ̡�ѧ�����ɼ�
		run(); // ��ʼ���տ���̨����
	}

	// ��Ӧ����̨����
	public static void run() {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("----------\nPlease enter instructions:");
			String command = scn.next();

			if (command.equalsIgnoreCase("avg")) {// "avg"������Ҫһ������
				String parameter = scn.next();
				if (parameter.equalsIgnoreCase("all")) { // avg all ��ʾȫ���γ̵�ƽ���֣�����������
					for (int i = 0; i < STUDENT_NUM; ++i) {
						score[i][COURSE_NUM] = avg(students[i]);
					}
					for (int i = 0; i < COURSE_NUM; ++i) {
						score[STUDENT_NUM][i] = avg(courses[i]);
					}
					show();
				} else { // avg �γ�������ѧ������ ��ʾ�ÿγ̣�ѧ����ƽ����
					avg(parameter);
				}
			}
			if (command.equalsIgnoreCase("get")) {// "get"������Ҫ��������
				String parameter1 = scn.next();
				String parameter2 = scn.next();
				get(parameter1, parameter2);
			}
			if (command.equalsIgnoreCase("sort")) {// "sort"������Ҫһ������
				String parameter = scn.next();
				sortByScore(parameter);
			}
			if (command.equalsIgnoreCase("max")) {// "max"������Ҫһ������
				String parameter = scn.next();
				findMax(parameter);
			}
			if (command.equalsIgnoreCase("exit")) {// �˳���ѯϵͳ
				System.out.println("Exit! byebye!");
				System.exit(0);
			}
		}
		// scn.close();
	}

	public static void initScore() { // ���������ʼ���ɼ�
		for (int i = 0; i < score.length; ++i) {
			for (int j = 0; j < score[i].length; ++j) {
				if (i == score.length - 1 || j == score[i].length - 1)
					score[i][j] = 0;
				else
					score[i][j] = (int) (Math.random() * 101);
			}
		}
	}

	public static void show() { // ��ʾ�ɼ�
		System.out.print("\t"); // ������ʾ������λ��
		// ����γ�����
		for (int i = 0; i < courses.length; ++i) {
			System.out.print(courses[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < score.length; ++i) {
			// ��ʾѧ������
			System.out.print(students[i] + "\t");
			// ��ʾ��ѧ���ɼ�
			for (int j = 0; j < score[i].length; ++j) {
				if (i == score.length - 1 && j == score[i].length - 1)
					System.out.printf("\t");
				else
					System.out.printf("%.2f\t", score[i][j]);
			}
			System.out.println();
		}
	}

	/***
	 * condition1:ѧ������ condition2:�γ�����
	 */
	public static void get(String condition1, String condition2) {

		int i_index = -1, j_index = -1;

		// �����Ƿ���ڸ�ѧ��i_index
		for (int i = 0; i < students.length; ++i) {
			if (students[i].equalsIgnoreCase(condition1)) {
				i_index = i;
			}
		}
		if (i_index != -1) { // �д��ˣ����������Ƿ��д˿γ�j_index
			for (int j = 0; j < courses.length; ++j)
				if (courses[j].equalsIgnoreCase(condition2)) {
					j_index = j;
				}
		} else {
			System.out.println("Student " + condition1 + " not found");
			return;
		}

		if (j_index != -1) {
			System.out
					.println("Score of " + condition1 + "\'s course " + condition2 + " is:" + score[i_index][j_index]);
		} else {
			System.out.println(condition1 + "doesn\'t have a course named" + condition2);
			return;
		}
	}

	/***
	 * 
	 * condition:��ƽ���ֵĲ�����ѧ������/�γ����ƣ�
	 */
	public static double avg(String condition) {
		int i_index = -1, j_index = -1;
		double sum = 0;
		double avgScore = 0;
		// �����Ƿ���ѧ������
		for (int i = 0; i < students.length - 1; ++i) {
			if (students[i].equalsIgnoreCase(condition)) {
				i_index = i;
			}
		}
		if (i_index != -1) {// ������ѧ������
			// ��ѧ����ƽ����
			for (int j = 0; j < score[i_index].length - 1; ++j) {
				sum = sum + score[i_index][j];
			}
			avgScore = sum / STUDENT_NUM;
			System.out.printf("Average score of %s is:%.2f\n", condition, avgScore);
		} else {
			// ���Ҳ����Ƿ��ǿγ�
			for (int j = 0; j < courses.length - 1; ++j) {
				if (courses[j].equalsIgnoreCase(condition)) {
					j_index = j;
				}
			}
			if (j_index != -1) { // �����ǿγ���
				for (int i = 0; i < score.length - 1; ++i) {
					sum = sum + score[i][j_index];
				}
				avgScore = sum / COURSE_NUM;
				System.out.printf("Average score of %s is:%.2f\n", condition, avgScore);
			} else {
				System.out.println("You entered neither course name nor student name!");
			}
		}
		return avgScore;
	}

	/***
	 * 
	 * sort_condition:����γ�����
	 */
	public static void sortByScore(String sort_condition) {
		int i, j;
		int j_index = -1;

		for (j = 0; j < courses.length; ++j) { // ���ҿγ̵�index
			if (courses[j].equalsIgnoreCase(sort_condition)) {
				j_index = j;
			}
		}
		if (j_index == -1) {
			System.out.println("Course not found!");
			return;
		}

		// ���ɼ����ݵ�����ʱ������
		double[] score_temp = new double[STUDENT_NUM];
		for (i = 0; i < STUDENT_NUM; ++i) {
			score_temp[i] = score[i][j_index];
		}
		// ���������뵽��ʱ������
		String[] students_temp = new String[STUDENT_NUM];
		for (i = 0; i < STUDENT_NUM; ++i) {
			students_temp[i] = students[i];
		}

		// ��score_temp����ð�ݷ�����ͬʱ��student_temp���ݽ���ͬ������
		for (int k = 0; k < score_temp.length - 1; ++k) {
			for (int kk = 0; kk < score_temp.length - k - 1; ++kk) {
				if (score_temp[kk] > score_temp[kk + 1]) {
					// �����ɼ�
					double temp = score_temp[kk];
					score_temp[kk] = score_temp[kk + 1];
					score_temp[kk + 1] = temp;

					// �����ɼ���ͬʱ��������
					String tmp_str = students_temp[kk];
					students_temp[kk] = students_temp[kk + 1];
					students_temp[kk + 1] = tmp_str;
				}
			}
		}

		// ���������
		// 1.���̧ͷ
		System.out.println("Rank\tName\t" + courses[j_index] + "\t");

		// 2.�������
		for (int k = 0; k < score_temp.length; ++k) {
			System.out.println((k + 1) + "\t" + students_temp[k] + "\t" + score_temp[k]);
		}
	}

	/***
	 * 
	 * condition:�����Ĳ�����ѧ������/�γ����ƣ�
	 */
	public static double findMax(String condition) {
		int i_index = -1, j_index = -1;
		double maxScore = 0;
		int maxIndex = 0;
		// �����Ƿ���ѧ������
		for (int i = 0; i < students.length - 1; ++i) {
			if (students[i].equalsIgnoreCase(condition)) {
				i_index = i;
			}
		}
		if (i_index != -1) {// ������ѧ������
			// �����ֵ
			for (int j = 0; j < COURSE_NUM; ++j) {
				if (score[i_index][j] > maxScore) {
					maxScore = score[i_index][j];
					maxIndex = j;
				}
			}
			System.out.printf("The highest score of %s is of %s:%.2f\n", condition, courses[maxIndex], maxScore);
		} else {
			// ���Ҳ����Ƿ��ǿγ�
			for (int j = 0; j < courses.length - 1; ++j) {
				if (courses[j].equalsIgnoreCase(condition)) {
					j_index = j;
				}
			}
			if (j_index != -1) { // �����ǿγ���
				for (int i = 0; i < STUDENT_NUM; ++i) {
					if (score[i][j_index] > maxScore) {
						maxScore = score[i][j_index];
						maxIndex = i;
					}
				}
				System.out.printf("The highest score of %s is of %s:%.2f\n", condition, students[maxIndex], maxScore);
			} else {
				System.out.println("You entered neither course name nor student name!");
			}
		}
		return maxScore;
	}
}
