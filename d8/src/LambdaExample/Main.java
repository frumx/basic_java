package LambdaExample;

interface Value {
	double getValue();
}

public class Main {

	public static void main(String[] args) {
		Value a = () -> 2.0 + 5.0;
		System.out.println(a.getValue());
	}

}
