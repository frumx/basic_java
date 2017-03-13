package d2;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		System.out.println("Podaj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Podaj liczbe");
			array[i] = sc.nextInt();
		}
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / (double) array.length;

		System.out.println("Srednia to: " + avg + " Suma to: " + sum);
	}
}
