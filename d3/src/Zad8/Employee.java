package Zad8;

import java.util.ArrayList;

public class Employee extends Person {
	private double salary;
	private static ArrayList<Employee> globalEmployees = new ArrayList<Employee>();

	public Employee(String name, String surname, double salary) {
		super(name, surname);
		this.setSalary(salary);
		Employee.globalEmployees.add(this);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double annualSalary() {
		return 12 * salary;
	}

	public static double sumOfSalaries() {
		double sum = 0;
		for (Employee e : Employee.globalEmployees) {
			sum += e.getSalary();
		}
		return sum;
	}
}
