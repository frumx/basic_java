package d1;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int length = name.length();
		System.out.println(name.charAt(length - 1));

		// or System.out.println(name.charAt(name.length()-1));
	}
}
