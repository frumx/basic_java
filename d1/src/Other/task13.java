package d1;

import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		String word = new Scanner(System.in).next();
		System.out.println(new StringBuilder(word).reverse());
		// ponizej alternatywnie z petla
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(word.charAt(i)); 
		}
	}
}
