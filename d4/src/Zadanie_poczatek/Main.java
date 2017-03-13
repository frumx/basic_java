package Zadanie_poczatek;

/* Mamy miejsce garazowe ktore chcemy wynaj¹c. Mamy dane takie jak: 
  -adres
  -cena za dzien
  -wspolrzedne geograficzne miejsce
  Albo mozemy podac Adres i cene, albo wspolrzedne geograficzne i cene, przy wyszukiwaniu.
  Chcemy miec dane klienta ktory to miejsce wynajmuje.
  Klient:
  -imie
  -nazwisko
  -email
  -telefon
  
  Dodatkowo dla chetnych: 
  Jak wpisujemy adres to zeby nam ze strina automatycznie zrobil wspolrzedne
  Jak wpisujemy wspolrzedne to zeby zrobil adres  
 */

public class Main {

	public static void main(String[] args) {
		
		ParkingSpot place = new ParkingSpot("Warszawa Kolejowa 49", 200);
		place.setOwner(new Client("s","s","s","s"));
		ParkingSpot secondPlace = new ParkingSpot("Warszawa Grójecka",120.15, new Client("s","s","s","s"));
		System.out.println(secondPlace.toString());		//lepsze wypisanie, czary mary!
	}
}
