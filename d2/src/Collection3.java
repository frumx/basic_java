package d2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Collection3 {

	public static void main(String[] args) {
		Set<Integer> pool = new HashSet<Integer>();
		for (int i = 1; i <= 49; i++) {
			pool.add(i);
		}
		Random r = new Random(System.currentTimeMillis());
		int[] result = new int[6];
		int count = 0;
		while (count < 6) {
			int randomNumber = r.nextInt(49) + 1;
			if (pool.contains(randomNumber)) {
				pool.remove(randomNumber);
				result[count] = randomNumber;
				count++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
