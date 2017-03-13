package Zad5;

import java.time.LocalDate;

public class Guarantee {

	private Product product;
	private LocalDate validUntil;

	public Guarantee(LocalDate validUntil) {
		this.validUntil = validUntil;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public LocalDate getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(LocalDate validUntil) {
		this.validUntil = validUntil;
	}

	public boolean isValid() {
		if (validUntil.isAfter(LocalDate.now())) {
			return true;
		} else {
			return false;
		}
	}
}
