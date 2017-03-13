package INT3;

public class Person {

	private Savable s;
	
	public void chooseSave(Savable ones){
		this.s=ones;
	}
	
	public void save(){
	s.save();
	}
	
}
