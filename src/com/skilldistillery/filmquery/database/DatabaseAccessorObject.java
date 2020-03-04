package com.skilldistillery.filmquery.database;

import java.util.List;

import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class DatabaseAccessorObject implements DatabaseAccessor {

	@Override
	public Film findFilmById(int filmId) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
		

	@Override
	public Actor findActorById(int actorId) {
		
		return null;
	}

	@Override
	public List<Actor> findActorsByFilmId(int filmId) {
		
		return null;
	}

}
