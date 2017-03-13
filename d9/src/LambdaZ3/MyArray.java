package LambdaZ3;

import java.util.ArrayList;

public class MyArray {
	public static ArrayList<Integer> map(ArrayList<Integer> elements, Map map) {

		ArrayList<Integer> returnArray = new ArrayList<Integer>();

		for (Integer a : elements) {
			returnArray.add(map.value(a));
		}
		return returnArray;
	}
}
