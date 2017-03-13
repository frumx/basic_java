package Zad1_Wyjatki;

import java.util.Scanner;

public class OperationExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		try {
			System.out.println(Number.divide(a, b));
		} catch (DivideByZeroException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
