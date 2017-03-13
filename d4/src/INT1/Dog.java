package INT1;

public class Dog implements Speakable {

	@Override
	public String getVoice(int voice) {
		if (voice == LOUD) {
			return "HOW";
		} else
			return "how";
	}
}
