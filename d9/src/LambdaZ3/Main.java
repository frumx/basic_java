package LambdaZ3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> elements = new ArrayList<Integer>();
		elements.add(5);
		elements.add(8);
		elements.add(12);
		System.out.println(MyArray.map(elements, (a)->a+5));

	}

}
