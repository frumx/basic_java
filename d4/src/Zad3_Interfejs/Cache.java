package Zad3_Interfejs;

public class Cache implements Savable {

	@Override
	public void save() {
		System.out.println("Zapis do cacha");		
	}
}
