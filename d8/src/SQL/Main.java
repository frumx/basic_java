package SQL;

import Refleksja1.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println(Connector.generateCreateTableSQL(Person.class));
		
		
		
		
	}
}
