package d2;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {

		System.out.println("Podaj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj liczbe");
			array[i] = sc.nextInt();
		}

		int min = array[0];
		int max = array[0];
		for (int v : array) { // tutaj v przyjmuje po kolei kazda wartosc z
								// array
			if (v < min)
				min = v;
			if (v > max)
				max = v;
		}
		System.out.println("Wartosc maksymalna to: " + max + " Wartosc minimalna to: " + min);
	}
}
