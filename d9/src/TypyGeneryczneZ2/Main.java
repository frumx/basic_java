package TypyGeneryczneZ2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> e = new ArrayList<Integer>();
		e.add(1);
		e.add(-1);
		e.add(-5);

		Collection.sort(e);
		for(Integer s: e){
			System.out.println(s);
			
		}
	}

}
