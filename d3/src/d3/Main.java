package d3;

public class Main {

	public static void main(String[] args) {
		Person firstPerson = new Person("Adam", "Kowalski");
		Person nextPerson = new Person("Jan", "Nowak", 18);
		Person lastPerson = new Person("Ania", "Lewandowska", 27, "female");
		System.out.println("Pierwsza osoba to" + firstPerson);
		System.out.println("Druga osoba to" + firstPerson);
		System.out.println("Ostatnia osoba to" + firstPerson);

	}
}
