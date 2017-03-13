package Zad1_Interfejs;

public interface Speakable {
	// przy deklaracji od razu sta³e staja sie public static final !!
	// nie da sie deklarowac zmiennych!!
	int QUIET=0;
	int LOUD=1;
	// tutaj mamy jakas metode, ale bez implementacji 
	String getVoice(int voice);

}
