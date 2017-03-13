package d1;

import java.util.Scanner;

//zadanie 4 pdf - zadania metody
public class Task17 {

	static double divide(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//analogicznie np. Math.PI
		if (divide(a,b)==Double.POSITIVE_INFINITY) {
			System.out.println("Nie dziel przez 0");
		} else {
			System.out.println(divide(a, b));
		}
	}
}
