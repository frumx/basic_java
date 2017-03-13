package Zad3_Interfejs;

public class DataBaseExample {

	public static void main(String[] args) {
		Person p = new Person();
		p.setObjectToSave(new Cache());
		p.save();
		p.setObjectToSave(new Database());
		p.save();		
	}
}
