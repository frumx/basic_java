package Zad9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		User p = new User("a", "b", "c", "d");
		User l = new User("e", "f", "g", "h");
		//to znaczy to samo co linika zakomentowana pod spodem
		
		ArrayList<User> all = User.getAll(); 
		System.out.println(all);
		
		//	System.out.println(User.getAll());	
	}
}
