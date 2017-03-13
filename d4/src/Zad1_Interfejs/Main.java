package Zad1_Interfejs;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Speakable> animals = new ArrayList<Speakable>();
		animals.add(new Cat());
		animals.add(new Dog());

		for (Speakable s : animals) {
			if (s instanceof Dog) {
				System.out.println(s.getVoice(Speakable.LOUD));
			}
			if (s instanceof Cat) {
				System.out.println(s.getVoice(Speakable.QUIET));
			}
		}
	}
}
