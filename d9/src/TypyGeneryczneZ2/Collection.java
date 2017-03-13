package TypyGeneryczneZ2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection<T> {

	public static <T extends Comparable<T>> void sort(ArrayList<T> elements) { // Tutaj
																				// wa¿ne,
																				// zeby
																				// dobrze
																				// okreslic
																				// typ
																				// statyczny!

		for (int i = 0; i < elements.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (elements.get(j).compareTo(elements.get(j - 1)) < 0) {
					Collections.swap(elements, j, j - 1);
				}
			}
		}
	}
}
