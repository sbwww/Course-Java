package chp6.homework.question7;

public class Employee implements java.lang.Comparable<Object> {
	private String id;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		// System.out.println("Employee created.");
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public int compareTo(Object obj) {
		Employee e = (Employee) obj;
		if (e instanceof Employee) {
			// return this.name.compareTo(e.name);
			return (int)(this.salary-e.salary);
		}
		return 0;
	}

	public String toString() {
		return this.id + ", " + this.name + ", " + this.salary;
	}
}