package d2;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		System.out.println("Podaj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj liczby: ");
			array[i] = sc.nextInt();
		}
		int[] count = new int[101];
		for (int i = 0; i < n; i++) {
			count[array[i]]++;
		}
		int maxid = count[0];
		int maxnumber = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > maxid) {
				maxid = count[i];
				maxnumber = i;
			}
		}
		System.out.println("Najczestsza wartosc tabeli to " + maxnumber);
	}
}
