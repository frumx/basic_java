package Zad2;

public class Car {

	private String brand;
	private double price;
	private String model;

	public Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Marka samochodu to " + getBrand() + " Model to " + getModel() + " a cena to " + getPrice();
	}

	public String show() {
		return "Marka samochodu to " + getBrand() + " cena to " + getPrice();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
