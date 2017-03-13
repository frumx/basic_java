package ABSTRACT1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Student("Adam", "Kowalski", "SGH"));
		people.add(new Employee("Wojtek", "Kot", 18765));
		System.out.println(people.getClass());
		System.out.println(people);
	}

}
