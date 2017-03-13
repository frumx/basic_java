package d1;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 4 == 0) {
			System.out.println("Liczba jest podzielna przez 4");
		} else {
			System.out.println("Liczba nie jest podzielna przez 4");
		}

	}

}
