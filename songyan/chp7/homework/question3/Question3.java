package chp7.homework.question3;

public class Question3 {
	public static void main(String[] args) {
		String name = "e:\\myfile\\txt\\result.txt";
		int index = name.lastIndexOf("\\") + 1;
		System.out.println("File name: " + name.substring(index));
		System.out.println("Modified file name: " + name.replaceAll("\\.txt", ".java"));
	}
}