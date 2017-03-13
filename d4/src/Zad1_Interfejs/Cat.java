package Zad1_Interfejs;

public class Cat implements Speakable{

	@Override
	public String getVoice(int voice) {
		
		if(voice==LOUD){
			return ("MIAU MIAU MIAU");			
		}
		else if(voice==QUIET){
			return ("miau miau miau");
		}
		return null;
	}
}
