package Zad3_Interfejs;

public class Person {

	private Savable writter;

	public void setObjectToSave(Savable save) {
		this.writter = save;
	}

	public void save() {
		writter.save();
	}
}
