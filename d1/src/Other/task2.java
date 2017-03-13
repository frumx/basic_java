package d1;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();


int tmp=a;
a=b;
 b=tmp;
 
 System.out.println("Zmienna a to "+a+"a zmienna b to"+b);
	}

}
