package Zad2;

public class Main {

	public static void main(String[] args) {
		Car audi = new Car("Audi", "A4", 100000);
		Car seat = new Car("Seat", "Ibiza", 5000);
		System.out.println(audi); // tutaj mozna kropke, ale nie trzeba bo on
									// wie ze toString jest Override, wiec to
									// dziala. Przy zadnej innej juz nie!
		System.out.println(seat.show());
	}
}
