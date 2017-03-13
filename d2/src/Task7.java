package d2;

//metody zadania - z13
public class Task7 {

	public static int power(int a, int n) {
		if (a==0) return 0;
		if (n==0) return 1;
		int number = 1;
		for (int i = 1; i <= n; i++) {
			number = number * a;
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(power(3, 3));
	}
}
