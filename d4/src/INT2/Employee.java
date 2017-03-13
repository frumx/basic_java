package INT2;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private String name;
	private String surname;
	private double salary;

	
	public Employee (String name, String surname, double salary) {
		this.name=name;
		this.surname=surname;
		this.salary=salary;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}





	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary())
		return (int)(o1.getSalary());
		
	}

}
