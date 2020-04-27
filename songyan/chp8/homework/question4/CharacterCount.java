// CharacterCount.java
package chp8.homework.question4;

import java.util.*;

public class CharacterCount {

	private Map<Character, Integer> hashMap;

	public CharacterCount() {
		hashMap = new HashMap<Character, Integer>();
		Scanner scanner = new Scanner(System.in);
		String str = new String();
		System.out.println("Please enter a string:");
		str = scanner.nextLine();
		for (int i = 0; i < str.length(); ++i) {
			Character c = str.charAt(i);
			Integer n = hashMap.get(c);
			hashMap.put(c, n == null ? 1 : ++n);
		}
		scanner.close();
	}

	public CharacterCount(Map<Character, Integer> hashMap) {
		this.hashMap = hashMap;
	}

	public void setHashMap(Map<Character, Integer> hashMap) {
		this.hashMap = hashMap;
	}

	public Map<Character, Integer> getHashMap() {
		return this.hashMap;
	}

	public void showHashMap() {
		Iterator<Character> iter = hashMap.keySet().iterator();
		while (iter.hasNext()) {
			Character c = (Character) iter.next();
			System.out.println(c + ":" + hashMap.get(c));
		}
	}
}
