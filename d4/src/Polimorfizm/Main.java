/*
package Polimorfizm;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.toString());
		Object secondUser = new User(); 			// czyli secondUser jest objectem tutaj
		secondUser. 			// tutaj jest interpretowany jako Object, ma dostep tylko do
							// metod objectu
		User nextUser = (User) secondUser; // po zrzutowaniu ma dostep
													// do metod Objectu i
													// Usera!!!
		nextUser.setUsername("ss");
		System.out.println(secondUser.getClass());
		System.out.println(secondUser);
		System.out.println((Object) secondUser);

		ArrayList<User> users = new ArrayList<User>();
		user.add(new Admin()); 			// Admin dziedziczy po User
		user.add(new RegularUser()); 	// RegularUser dziedziczy po User
		for (User u : users) {
			System.out.println(u);
			if (u instanceof Admin) {		
				Admin a = (Admin) u;
				System.out.println();
			}
		}
	}
}
*/