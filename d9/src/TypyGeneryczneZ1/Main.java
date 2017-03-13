package TypyGeneryczneZ1;

public class Main {

	public static void main(String[] args) {
		
		Pair<String, Integer> pair = new Pair<String, Integer>("Adam", 3);
		System.out.println(pair.getFirst()+" "+pair.getLast());
		String name=pair.getFirst();
		int m=pair.getLast();
		pair.setFirst(name+" Kowalski");
		pair.setLast(m);//autoboxing
		System.out.println(pair.getFirst()+" "+pair.getLast());
		
	}

}
