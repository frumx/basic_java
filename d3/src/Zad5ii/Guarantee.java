package Zad5ii;

import java.time.LocalDate;

public class Guarantee {
	private LocalDate validUntil;
	private Product p;
	
	public Guarantee(LocalDate validUntil){
		this.validUntil=validUntil;
	}

	public boolean isValid() {
		if (validUntil.isAfter(LocalDate.now())) {
			return false;
		} else {
			return true;
		}
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}
}
