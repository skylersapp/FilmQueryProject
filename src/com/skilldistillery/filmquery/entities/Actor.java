package com.skilldistillery.filmquery.entities;

import java.util.List;

public class Actor {
	private int id;
	private String firstName;
	private String lastName;
	private List<Film> films;
	
	public Actor() {
	}
	

	public Actor(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Actor(int id, String firstName, String lastName, List<Film> films) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.films = films;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}


	@Override
	public String toString() {
		return "\nFirst Name:" + firstName + "\n Last Name: " + lastName + "\n";
	}



	
	
}
