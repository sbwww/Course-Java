// FoodMenu.java

package chp9.ex2;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
	private List<String> menu;

	public FoodMenu() {
		this.menu = new ArrayList();
	}

	public List<String> getMenu() {
		return this.menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}

	public void addFood(String food) {
		this.menu.add(food);
	}

	public String getFoodByNo(int no) {
		return this.menu.get(no-1);
	}

	public int getFoodNumbers() {
		return this.menu.size();
	}

	public void showMenu() {
		for (int i = 1; i <= this.getFoodNumbers(); ++i) {
			System.out.println(i + ". " + this.getFoodByNo(i));
		}
	}

}
