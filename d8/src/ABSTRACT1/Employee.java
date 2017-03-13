package ABSTRACT1;

public class Employee extends Person {
	private double salary;

	@Override
	public String toString() {
		return super.toString() + " " + salary;
	}

	public Employee(String name, String surname, double salary) {
		super(name, surname);
		this.setSalary(salary);
	}

	@Override
	public void rest() {
		System.out.println("Odpoczywam");

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
