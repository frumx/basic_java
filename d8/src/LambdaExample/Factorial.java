package LambdaExample;

interface Score {
	int value(int a);
}

public class Factorial {

	public static void main(String[] args) {
		Score silnia = (a) -> {
			int score = 1;
			for (int i = 1; i < a; i++) {
				score *= i;
			}
			return score;
		};
		System.out.println(silnia.value(5));
	}
}
