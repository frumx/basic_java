package d2;

//metody zadania - z8
public class Task3 {
	public static boolean isPrime(int a) {
		for (int i = 2; i < a - 1; i++) { // max moglby byc (int)Math.sqrt(a)
			if (a % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(13));
	}
}
