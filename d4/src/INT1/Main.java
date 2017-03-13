package INT1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Speakable> animal = new ArrayList<Speakable>();
		animal.add(new Cat());
		animal.add(new Dog());
		
		for(Speakable s:animal){
			if(s instanceof Dog){
				System.out.println(s.getVoice(Speakable.LOUD));
			}
			else if (s instanceof Cat){
				System.out.println(s.getVoice(Speakable.QUIET));
			}
		}		
	}
}
