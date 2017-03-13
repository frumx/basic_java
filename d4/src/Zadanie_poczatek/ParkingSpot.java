package Zadanie_poczatek;


public class ParkingSpot {
	private String adress;
	private double price;
	private double longitude;
	private double latitude;
	
	
	private Client owner;
	
	
	public void setOwner(Client owner){
		this.owner = owner;
	}
	
	public ParkingSpot(String adress, double price) {
		this.adress = adress;
		this.price = price;		
	}
	
	public ParkingSpot(double longitude, double latitude, double price) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.price=price;
	}
	
	public ParkingSpot(String adress, double price, Client client) {
		this.adress = adress;
		this.price = price;
		this.owner=client;		
	}
	
	public ParkingSpot(double longitude, double latitude, double price, Client client) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.price=price;
		this.owner=client;
	}
	
	
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}	

	public Client getFirst() {
		return owner;
	}

	public void setFirst(Client owner) {
		this.owner = owner;
	}
	@Override
	public String toString(){
		return adress+" "+price+""+longitude+" "+latitude+" "+owner;
	}
	
}
