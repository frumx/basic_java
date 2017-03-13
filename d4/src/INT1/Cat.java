package INT1;

public class Cat implements Speakable {

	@Override
	public String getVoice(int voice) {
		if(voice==LOUD){
			return "MIA";
		}
		else return "mia";
			}
}
