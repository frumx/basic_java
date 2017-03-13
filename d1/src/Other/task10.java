package d1;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b) {
			System.out.println("Zmienne sa rowne");
		} else {
			System.out.println("Zmienne sa inne");
		}
		String firstName = "Jozef";
		String lastName = "Kowal";
		if (firstName.equals(lastName)) {
			System.out.println("Stringi sa rowne");
		} else {
			System.out.println("Stringi sa inne");
		}
	}
}
