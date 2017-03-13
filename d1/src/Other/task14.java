package d1;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		String name=new Scanner(System.in).next();
		
		for(int i=1; i<name.length(); i=i+2){
			System.out.print(name.charAt(i));			
		}
	}
}
