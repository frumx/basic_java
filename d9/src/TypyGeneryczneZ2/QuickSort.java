package TypyGeneryczneZ2;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort<T> {

	public static <T extends Comparable<T>> void sort(ArrayList<T> elements) {

		int lowerIndex=0;
		int higherIndex=elements.size();
		int i = lowerIndex;
		int j = higherIndex;
		
		int pivot=(i + (j - i) )/ 2;
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (elements.get(i).compareTo(pivot) < 0) {
				i++;
			}
			while (elements.get(j).compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				Collections.swap(elements, i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			sort(lowerIndex, j);
		if (i < higherIndex)
			sort(i, higherIndex);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		MyQuickSort sorter = new MyQuickSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
