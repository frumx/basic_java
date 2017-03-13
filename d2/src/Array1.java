package d2;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("Podaj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj liczby: ");
			array[i] = sc.nextInt();
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
