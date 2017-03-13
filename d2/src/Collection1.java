package d2;

import java.util.HashMap;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();

		dict.put("bialas", "snowflake");
		dict.put("laska", "babe");
		dict.put("ulica", "street yo");

		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		System.out.println(dict.get(word));
	}
}
