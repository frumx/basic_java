package d1;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfBlocks = sc.nextInt();
		int capacity = sc.nextInt();
		if (numberOfBlocks % capacity == 0) {
			System.out.println("Potrzeba pojemnikow: " + numberOfBlocks / capacity);
			System.out.println("W ostatnim pojemniku jest klockow: " + capacity);
		} else {
			System.out.println("Potrzeba pojemnikow: " + (numberOfBlocks / capacity + 1));
			System.out.println("W ostatnim pojemniku jest klockow: " + numberOfBlocks % capacity);
		}
	}
}
