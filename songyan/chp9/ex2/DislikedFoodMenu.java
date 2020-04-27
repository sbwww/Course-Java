// DislikedFoodMenu.java

package chp9.ex2;

import java.util.ArrayList;
import java.util.List;

public class DislikedFoodMenu {
	private List<String> disMenu;

	public DislikedFoodMenu() {
		this.disMenu = new ArrayList();
	}

	public void addDislikedFood(String food) {
		this.disMenu.add(food);
	}

	public void checkFood(String food) throws BadFoodException {
		for (String disFood : disMenu) {
			if (disFood.equals(food)) {
				throw new BadFoodException();
			}
		}
	}
}
