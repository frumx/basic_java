package d2;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("Podaj n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Podaj liczby: ");
			array[i] = sc.nextInt();
		}
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Najmniejsza wartosc tabeli to " + min);
	}
}
