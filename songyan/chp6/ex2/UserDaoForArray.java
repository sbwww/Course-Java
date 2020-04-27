// UserDaoForArray.java
package chp6.ex2;

public class UserDaoForArray implements UserDao {
	private User[] data;
	private int count = 0;

	public UserDaoForArray() {
		data = new User[10];
	}

	public boolean addUser(User user) {
		if (count == data.length) { // 用户上限已达到
			System.out.println("User list is full!");
			return false;
		}

		// 查找用户是否已存在
		for (int i = 0; i < count; ++i) {
			if (data[i].getUserName().equals(user.getUserName())) {
				System.out.println(user.getUserName() + " already exist!");
				return false;
			}
		}

		// 添加新用户
		data[count] = user;
		++count;
		return true;
	}

	public User getUser(String userName, String password) {
		for (int i = 0; i < count; ++i) {
			if (data[i].getUserName().equals(userName) && data[i].getPassword().equals(password)) {
				return new User(userName, password);
			}
		}
		return null;
	}
}
