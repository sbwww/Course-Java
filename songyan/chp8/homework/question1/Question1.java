package chp8.homework.question1;

import java.util.*;

public class Question1 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("2");
		set.add("3");
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}