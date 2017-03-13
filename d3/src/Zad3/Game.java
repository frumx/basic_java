package Zad3;

import java.util.ArrayList;

public class Game {
	private String name;

	private static final int POINTSTOWIN = 100;

	private ArrayList<Player> players = new ArrayList<Player>();

	public Game(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player p) {
		this.players.add(p);
	}

	public void printWinner() {
		if (players.isEmpty()) {
			System.out.println("Brak zawodnikow w grze");
		} else {
			Player bestPlayer = getBestPlayer();

			if (bestPlayer.getNumberOfPoints() >= Game.POINTSTOWIN) {
				System.out.println(bestPlayer);
			} else {
				System.out.println("Nie ma zawodika ktory ma powyzej" + Game.POINTSTOWIN);
			}
		}
	}

	private Player getBestPlayer() {
		Player bestPlayer = players.get(0);
		for (Player p : players) {
			if (p.getNumberOfPoints() > bestPlayer.getNumberOfPoints()) {
				bestPlayer = p;
			}
		}
		return bestPlayer;
	}
}