package Zad3;

public class Main {

	public static void main(String[] args) {
		Game game = new Game("Gra w statki");
		/*
		 * Player p=new Player("michalos", 102); 
		 * game.addPlayer(p);
		 */
		game.addPlayer(new Player("michalos", 102));
		game.addPlayer(new Player("kurczak", 105));
		game.addPlayer(new Player("rafal", 13));
		game.printWinner();
	}
}
