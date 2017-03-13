package d1;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		System.out.println("Podaj wiek osoby: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Jestes pe³noletnia osoba!");
		} else {
			System.out.println("Jestes dzieckiem!");
		}
	}
}
