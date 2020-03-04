package com.skilldistillery.filmquery.app;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {
	
	
//	-------------------------------------	
//	User Story 1
//	The user is presented with a menu in which they can choose to:
//
//	•Look up a film by its id.
//	•Look up a film by a search keyword.
//	•Exit the application.
//	
//	-------------------------------------
//	User Story 2
//	If the user looks up a film by id, they are prompted to enter the film id. 
//	If the film is not found, they see a message saying so. 
//	If the film is found, its title, year, rating, and description are displayed.
//	
//	-------------------------------------
//	User Story 3
//	If the user looks up a film by search keyword, they are prompted to enter it.
//	If no matching films are found, they see a message saying so. 
//	Otherwise, they see a list of films for which the search term was found anywhere in the title
//	or description, with each film displayed exactly as it is for User Story 2.
//	
//	-------------------------------------
//	User Story 4
//	When a film is displayed, its language (English,Japanese, etc.) is also displayed.
//	
//	-------------------------------------
//	User Story 5
//	When a film is displayed, the list of actors in its cast is displayed along with the 
//	title, year, rating, and description.
//	
//	-------------------------------------
	
  DatabaseAccessor db = new DatabaseAccessorObject();

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    FilmQueryApp app = new FilmQueryApp();
//    app.test();
    app.launch();
  }

  private void launch() throws SQLException {
    Scanner input = new Scanner(System.in);
    
    startUserInterface(input);
    
    input.close();
  }

  private void startUserInterface(Scanner input) throws SQLException {
    boolean keepGoing = true;
    do {
    	System.out.println("\n\n\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    	System.out.println("\n\t\tWelcome to FILMSEARCH!!!!");
    	System.out.println("\t\tEnter a number from the menu below to make a search selection!\n");
    	System.out.println("\t\t\t\t1: Search film by id \n\n"
    			+ "\t\t\t\t2: Search film by keyword \n\n"
    			+ "\t\t\t\t3: -- Exit -- \n\n");
    	System.out.println("\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");
    	System.out.print("SEARCH OPTION >: ");
    	String userInput =  input.next();
    	
    	switch (userInput) {
		case "1":
			System.out.println("\t_____________________________________________________\n");
			System.out.println("\t\tWhich Film ID would you like to retrieve?\n");
			System.out.println("\t_____________________________________________________\n");
			System.out.print("FILM ID >: ");
			userInput = input.next();
			Film pickFilm = db.findFilmById(Integer.parseInt(userInput));
			System.out.println(pickFilm);
			break;
		case "2":
			System.out.println("\t_____________________________________________________\n");
			System.out.println("\t\tPlease enter in a search keyword: ");
			System.out.println("\t_____________________________________________________\n");
			userInput = input.next();
			List<Film> keyword =  db.findFilmsByKeyword(userInput);
			for (Film film : keyword) {
				System.out.println(film);
			}
			break;
		case "3":
	    	System.out.println("\n\n\n\n\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	    	System.out.println("\n\t\t\t\tTHANK YOU!!! HAVE A GREAT DAY!!!\n");
	    	System.out.println("\n\t\t\t\t\t---- GOODBYE ----\n");
	    	System.out.println("\t*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");
	    	System.out.println("\n\n\n");
			keepGoing = false;
			break;
		default:
			System.out.println("That is not a valid selection");
			break;
		}
    } while(keepGoing);
  }
  

}
