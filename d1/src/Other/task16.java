package d1;

public class task16 {

	int add(int a, int b){
		return a+b;
	}
	
	static int substract(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {

		task16 task = new task16();	//tworzymy nowy obiekt tutaj
		System.out.println(task.add(5, 8));
		System.out.println(substract(5, 8));	//nie tworzymy nowego obiektu bo jest static w funkcji			
	}
}
