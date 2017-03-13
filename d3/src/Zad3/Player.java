package Zad3;

public class Player {
	private String name;	
	private int numberOfPoints;

	public Player(String name, int numberOfPoints) {
		this.name = name;		
		this.numberOfPoints = numberOfPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}
	@Override
	public String toString(){
		return name+" "+" liczba punktow to: "+numberOfPoints;
	}

}
