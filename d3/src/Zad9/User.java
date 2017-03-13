package Zad9;

import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	private String name;
	private String surname;

	private static ArrayList<User> all = new ArrayList<User>();

	public User(String username, String password, String name, String surname) {
		this.setUsername(username);
		this.password = password;
		this.name = name;
		this.surname = surname;
		User.all.add(this);
	}

	public static ArrayList<User> getAll() {		
		return User.all;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	//poniewaz kazda klasa dziedziczy z klasy object to nasza nowa implementacja toString jest wykorzystana pomimo ze nigdzie nie ejst zaimplementowana
	public String toString(){
		return username+" "+password+" "+name+" "+surname;
	}
}
