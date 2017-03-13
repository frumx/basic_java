package Zad3_Interfejs;

public class Database implements Savable{

	@Override
	public void save() {
		System.out.println("Zapis do bazy danych");		
	}
}
