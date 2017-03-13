package d2;

import java.util.Random;

public class Array13 {

	public static void printMatrix(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		final int s = 10;
		int[][] t = new int[s][s];
		Random r = new Random(System.currentTimeMillis());
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				t[i][j] = r.nextInt(100);
			}
		}
		printMatrix(t);
	}
}
