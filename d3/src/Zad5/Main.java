package Zad5;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Product p = new Product("Pralka bosh", "Super pralka", "Bardzo dobra");
		Product l = new Product("Pralka wh", "wow", "good");
		Guarantee g = new Guarantee(LocalDate.of(2017, 12, 13));
		g.setProduct(p);
		System.out.println(g.isValid());
	}

}
