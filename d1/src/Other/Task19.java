package d1;

import java.util.Scanner;

// Zadanie 5 - plik pdf zadania metody
public class Task19 {

	boolean isPythagoreant(int a, int b, int c) {
		if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Task19 task = new Task19();
		if (task.isPythagoreant(a, b, c)) {
			System.out.println("Liczby pitagorejskie");
		} else
			System.out.println("Liczby nie sa pitagorejskie");
	}
}
