package Z3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		try{
			System.out.println(Main.getUserAnswer(answer));
		}catch (UnknownAnswearException e){
			System.out.println(e.getMessage());
		}
	}

	public static String getUserAnswer(String answer) throws UnknownAnswearException {
		for (Answer a : Answer.values()) {
			if (answer.equals(a.toString()) || answer.equals(a.toString().toLowerCase())) {
				return a.getAnswer();
			}
		}
		throw new UnknownAnswearException("Nieznana odpowiedz");
	}
}
