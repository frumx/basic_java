package d1;

import java.util.Scanner;

public class task12alternative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		StringBuilder sb = new StringBuilder(word);
		// sb.setCharAt(0, 'w');
		// System.out.println(sb);
		// to reverse w if dzia³a globalnie i odwraca kolejnosc sb nie tylko w petli
		if (sb.reverse().toString().equals(word)) {
			System.out.println("To jest palindrom");
		} else {
			System.out.println("Nie jest palindrom");
		}
		System.out.println(sb);
	}
}
