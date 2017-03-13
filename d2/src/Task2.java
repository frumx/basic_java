package d2;
//metody zadania - z7
public class Task2 {
	
public static boolean isSquare(int a){
	int root = (int)Math.sqrt(a);
	boolean isRoot=(root*root==a);	
	return isRoot;		// return root*root==a
}
	public static void main(String[	] args) {
		System.out.println(isSquare(16));
	}
}
