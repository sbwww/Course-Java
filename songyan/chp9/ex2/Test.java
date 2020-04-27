// Test.java

package chp9.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws BadFoodException {
		List<String> ordered = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		FoodMenu foodMenu = new FoodMenu();
		DislikedFoodMenu disMenu = new DislikedFoodMenu();

		foodMenu.addFood("麻辣香锅");
		foodMenu.addFood("排骨炖豆角");
		foodMenu.addFood("葱爆羊肉");
		foodMenu.addFood("酸辣土豆丝");
		foodMenu.addFood("清炒菜花");
		foodMenu.addFood("清炒芥蓝");

		disMenu.addDislikedFood("葱爆羊肉");

		foodMenu.showMenu();
		while (true) {
			System.out.print("请为大家点菜，输入编号即可（0表示点菜结束）: ");
			boolean orderSuccessful = true;
			int no = scanner.nextInt();
			if (no == 0) {
				break;
			}
			String newFood = foodMenu.getFoodByNo(no);
			try {
				disMenu.checkFood(newFood);
			} catch (BadFoodException e) {
				System.out.println("有人不喜欢该菜品...");
				orderSuccessful = false;
			}
			if (orderSuccessful) {
				ordered.add(newFood);
			}
			System.out.println("您已点的菜品如下: ");
			int num = 0;
			for (String food : ordered) {
				++num;
				System.out.println(num + ". " + food);
			}
		}
		scanner.close();
	}
}