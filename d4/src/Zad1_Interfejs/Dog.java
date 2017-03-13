package Zad1_Interfejs;

public class Dog implements Speakable {

	@Override
	public String getVoice(int voice) {
		
		if(voice==LOUD){
			return ("HAU HAU HAU");			
		}
		else if(voice==QUIET){
			return ("hau hau hau");
		}
		return null;
	}

}
