# FILM QUERY PROJECT

## Week 7 Homework for Skill Distillery
![Alt Text](https://media.licdn.com/dms/image/C510BAQGcpYt2uJmayQ/company-logo_200_200/0?e=2159024400&v=beta&t=8O5Shdlep30sQ_juAPhlhUJi1jz-wl7FrJom6oG4cnw)
## Overview

	You will create a command-line application that retrieves and displays film data. It will be menu-based, allowing the user to choose actions and submit query data.
	
	All JDBC code will be encapsulated in methods of the com.skilldistillery.filmquery.database.DatabaseAccessorObject class. As you need new database access methods, declare them first in the DatabaseAccessor interface, then implement them in DatabaseAccessorObject. Methods should return objects like Film, Actor, and List<Actor>, not String or List<String>.
	
	All user input and display output will be in methods of com.skilldistillery.filmquery.app.FilmQueryApp (or additional application classes in that package, if you choose to create them.) Comment out app.test(); and uncomment app.launch() as a starting point.

## Structure

	User Story 1
	The user is presented with a menu in which they can choose to:
	
	•Look up a film by its id.
	•Look up a film by a search keyword.
	•Exit the application.
	-----------------------------
	
	User Story 2
	If the user looks up a film by id, they are prompted to enter the film id. If the film is not found, they see a message saying so. If the film is found, its title, year, rating, and description are displayed.
	-----------------------------
	
	User Story 3
	If the user looks up a film by search keyword, they are prompted to enter it. If no matching films are found, they see a message saying so. Otherwise, they see a list of films for which the search term was found anywhere in the title or description, with each film displayed exactly as it is for User Story 2.
	-----------------------------
	
	User Story 4
	When a film is displayed, its language (English,Japanese, etc.) is also displayed.
	-----------------------------
	
	User Story 5
	When a film is displayed, the list of actors in its cast is displayed along with the title, year, rating, and description.

## Completion Criteria

	The application pushed to Github must satisfy all of the user stories without throwing any exceptions.

## Concepts
<ul>
	<li> Databases </li>
 	<li> Database Accessor Objects (DAOs) </li>
 	<li> JDBC API </li>
 	<li> Data Binding </li>
 	<li> MySql Queries </li>
 	<li> Prepared Statements </li>
 	<li> Dependencies [ Gradle/Maven ] </li>
 	<li> JUnit Testing </li>
 	<li> Regular Expressions [ Regex ] </li>
</ul>

 
## Technologies used 


![Alt Text](http://www.pngall.com/wp-content/uploads/2016/05/Java-PNG-180x180.png)
![Alt Text](https://itemis.ch/wp-content/uploads/sites/23/2015/06/eclipse5-180x180.jpg)
![Alt Text](https://media.trustradius.com/product-logos/GV/6S/3COGMZ775P74-180x180.PNG)
<br>
![Alt Text](https://upload.wikimedia.org/wikipedia/fr/e/ed/Gradle_Logo.png)
<br>
![Alt Text](http://ifixit.ie/wp-content/uploads/2015/02/Apple-logo-180x180.png)
![Alt Text](https://corballis.ie/images/mysql-logo-180x180.png)
![Alt Text](https://i.ya-webdesign.com/images/chrome-svg-ios-9-7.png)

## Challenges

I got stuck at one point during user story 5 where my SQL query contained a "JOIN" that was causing mild recursion. It was causing a two-way search that resulted in my films populating once per actor in them. This was a major frustration for me, as my mindset didn't immediately take me to that conclusion, and I ended up wasting more time than I should have trying to refactor and find the source of my fault. 

## Lessons Learned

The biggest lesson learned for me here is to constantly be referencing MySQL Workbench to verify all queries are populating correctly. Moving forward, if I get any result that is unexpected and I'm not immediately sure what the cause is, then I will immediately go into Workbench to see if that's the error, even if i'm mostly confident it is not. this would have saved me an immense amount of time in this project. 
