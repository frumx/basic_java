package d1;

public class Task18 {

	static void replace(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		hello();
	}

	static void hello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		replace(a, b);
		System.out.println("Wartosc a to: " + a + " Wartosc b to: " + b);
	}
}
