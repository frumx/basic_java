package reference;

import d3.Person;

public class ReferenceExample {

	public static void main(String[] args) {

		Person firstPerson = new Person("Adam", "Kowalski");
		Person nextPerson = new Person("Jozef", "Mlynarczyk");
		
		int a=10;
		int b=20;
		
		a=b;
		b=84;
		System.out.println("Wartosc a to: "+a+" Wartosc b to: "+b);
		
		firstPerson=nextPerson;
		nextPerson.setName("POP");
		nextPerson.setSurname("Pyton");
		System.out.println("Wartosc a to: "+firstPerson+" Wartosc b to: "+nextPerson);
	}
}
