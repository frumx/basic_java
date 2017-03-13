package d2;
//metody zadania - z6
public class Task1 {

	public static int sumOfDigits(int a) {
		int sum = 0;
		while (a > 0) {
			sum += a % 10;
			a = a / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(123));
	}
}
