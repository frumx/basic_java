package d2;

//metody zadania - z10
public class Task4 {
	public static int maximum(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	// return (a>b) ? a:b;

	public static void main(String[] args) {
		System.out.println(maximum(5, 9));
	}

}
