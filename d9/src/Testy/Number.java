package Testy;

import java.util.List;

public class Number {

	public int sumNmbers(List<Integer> numbers) {

		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}

	public static int NWD(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
