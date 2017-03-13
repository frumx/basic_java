package d1;

import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String word = new Scanner(System.in).next();
		String word = sc.next();
		int left = 0;
		int right = word.length() - 1;
		boolean palindrome = true;
		while (left <= right) {
			if (word.charAt(left) != word.charAt(right)){
				System.out.println("Nie jest palindromem");
			palindrome = false;
			break;
		}
		left++;
		right--;
		}
		if(palindrome) System.out.println("Jest palindromem");
	}
}
