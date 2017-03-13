package d2;

// metody zadania - z11
public class Task5 {

	public static int numberOfDividers(int a) {
		if (a == 1 || a == -1)
			return 1;
		if (a == 0)
			return 0;
		int count = 2;
		for (int d = 2; d < a / 2 + 1; d++) {
			if (a % d == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numberOfDividers(0));
	}
}
