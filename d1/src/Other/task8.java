package d1;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score = 1;
		for (int i = 1; i <= n; i++) {
			score *= i;
			System.out.println("Wynik silnia to: " + score + " a i wynosi " + i);
		}
		System.out.println("Wynik silnia ostateczny: " + score);
	}
}
