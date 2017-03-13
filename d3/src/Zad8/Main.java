package Zad8;

public class Main {

	public static void main(String[] args) {
		Employee firstEmployee = new Employee("Anna", "Nowak", 2221);
		Employee boss = new Employee("Karol", "Los", 4211);
		System.out.println(Employee.sumOfSalaries());
	}
}
