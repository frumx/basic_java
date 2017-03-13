package d2;

// metody zadania - z12
public class Task6 {

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

	public static int findMaxDividers() {
		int maxDividers = 1; // ktora wartosc
		int dividers = 1; // ile dzielnikow
		for (int i = 2; i < 10000; i++) {
			int tmp = numberOfDividers(i);
			if (tmp > maxDividers) {
				maxDividers = i;
				dividers = tmp; // ile
			}
		}
		return maxDividers;
	}

	public static void main(String[] args) {
		System.out.println(numberOfDividers(0));
		System.out.println(findMaxDividers());
	}
}
