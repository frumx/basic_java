package d2;

import java.util.Stack;

public class Collection2 {

	public static String toBinaryString(int a) {
		Stack<Integer> s = new Stack<Integer>();
		while (a > 0) {
			Integer r = a % 2;
			s.push(r);
			a /= 2;
		}
		String result = " ";
		while (!s.isEmpty()) {
			result = result + s.pop();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(toBinaryString(6));
	}
}
