package Zad2_Interfejs;

import java.util.ArrayList;
import java.util.Collections;

public class Company {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Zdzislaw", "Python", 10000));
		employees.add(new Employee("Adam", "Kowalski", 2100));
		Collections.sort(employees);
		for (Employee e : employees) {
			System.out.println(e.getSalary());
		}
	}
}
