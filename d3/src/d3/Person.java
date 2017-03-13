package d3;

public class Person {
	String name;
	String surname;
	int age;
	String gender;

	// ponizej bedzie konstruktor
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, int age) {
		this(name, surname); // ten konstruktor wywo³a poprzedni, tak by nie
								// powtarzac!
		// this.name=name;
		// this.surname=surname;
		this.age = age;
	}

	// przeciazenie to implementacja tego samego konstruktora z rozna iloscia
	// argumentow
	public Person(String name, String surname, int age, String gender) {
		this(name, surname, age);
		this.gender = gender;
	}

	// bez override tez dziala nadpisanie, lecz gdy sie pomylimy w nazwie to on
	// mowie ze taka nie istnieje w klasie object
	@Override
	public String toString() {
		return name + " " + surname + " " + " ma " + this.age + " oraz plec to" + gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
