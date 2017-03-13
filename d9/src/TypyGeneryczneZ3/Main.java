package TypyGeneryczneZ3;

public class Main {

	public static void main(String[] args) {

		Integer[] integerArray = { 1, 2, 7, -3 };
		String[] stringArray = { "A", "Z", "C" };
		GenericArray<Integer> genericArray = new GenericArray<Integer>(integerArray);
		MinMax<Integer> minMax = genericArray.getMinMax();

		GenericArray<String> genericArray2 = new GenericArray<String>(stringArray);
		MinMax<String> minMax2 = genericArray2.getMinMax();

		System.out.println("Max to: " + minMax.getMax() + " a MIN to: " + minMax.getMin());
		System.out.println("Max to: " + minMax2.getMax() + " a MIN to: " + minMax2.getMin());
	}
}
