/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eller.theater;

import static eller.theater.Movie.numMovies;
import java.util.Scanner;
/**
 *
 * @author n352991
 */
public class Theater {
    public static void main (String[]args){
        //(String ti, String ta, String sta, double st, double dur, double e, double adm)
        Movie SonOfGodzilla = new Movie("Son of Godzilla", "", "Tadao Takashima", 9.30, 84.0, 10.54, 5);
        Movie Interstella5555 = new Movie("Interstella 5555", "The 5tory of the 5ecret 5tar 5ystem", "Daft Punk", 12.0, 90.0, 13.0, 5);
        Movie MontyPythonAndTheHolyGrail = new Movie("Monty Python and the Holy Grail", "", "Graham Chapman", 11.0, 91.0, 12.31, 5);
        Movie KindergartetenCop = new Movie ("Kindergarten Cop", "Go ahead, you tell him you didn't do your homework.", "Arnold Schwarzenegger", 2.0, 111.0, 3.51, 5);
        
        System.out.println("Welcome to the Movie Theater! -- there are currently "+ numMovies + " movies showing:");
        
        String[] movies;
        movies = new String[5];
        movies[1] = SonOfGodzilla.getTitle();
        movies[2] = Interstella5555.getTitle();
        movies[3] = MontyPythonAndTheHolyGrail.getTitle();
        movies[4] = KindergartetenCop.getTitle();
        
        System.out.println("1: "+SonOfGodzilla.getInfo());
        System.out.println("2: "+Interstella5555.getInfo());
        System.out.println("3: "+MontyPythonAndTheHolyGrail.getInfo());
        System.out.println("4: "+KindergartetenCop.getInfo());
        
        // you have to write the getInfo method so that it returns all the info of the movie
        // getInfo() will be in the Movie class, and it returns a user-friendly String comprised
        // of the important info of the movie (concatenate the gets you've already written)
        String[] remaining;
        remaining = new String[4];
        System.out.println("Please select a movie you would like to see by typing its number...");
        int choice1 = new Scanner(System.in).nextInt();
        String movieChoice1 = " is not a valid movie choice";
        switch (choice1) {
            case 1: System.out.println("You have chosen: "+SonOfGodzilla.getTitle());
                movieChoice1 = SonOfGodzilla.getTitle();
                remaining[1] = movies[2];
                remaining[2] = movies[3];
                remaining[3] = movies[4];
                break;
            case 2: System.out.println("You have chosen: "+Interstella5555.getTitle());
                movieChoice1 = Interstella5555.getTitle();
                remaining[1] = movies[1];
                remaining[2] = movies[3];
                remaining[3] = movies[4];
                break;
            case 3: System.out.println("You have chosen: "+MontyPythonAndTheHolyGrail.getTitle());
                movieChoice1 = MontyPythonAndTheHolyGrail.getTitle();
                remaining[1] = movies[1];
                remaining[2] = movies[2];
                remaining[3] = movies[4];
                break;
            case 4: System.out.println("You have chosen: "+KindergartetenCop.getTitle());
                movieChoice1 = KindergartetenCop.getTitle();
                remaining[1] = movies[1];
                remaining[2] = movies[2];
                remaining[3] = movies[3];
                break;
            default: System.out.println("ERROR: " + choice1 + movieChoice1);
            System.exit(0);
                break;
        }
        System.out.println("Would you like to see a second movie? (y/n)");
        String yesno = new Scanner(System.in).nextLine();
        if(yesno.equals("y")){
            System.out.println("These are the movies you would be able to see after " + movieChoice1 + "...");
            System.out.println("1: " + remaining[1]);
            System.out.println("2: " + remaining[2]);
            System.out.println("3: " + remaining[3]);
            System.out.println("Please select your choice by typing in the corrisponding movie's number...");
        int choice2 = new Scanner(System.in).nextInt();
        String movieChoice2 = " is not a valid movie choice";
        switch (choice2) {
            case 1: System.out.println("You have chosen: " + remaining[1]);
                movieChoice2 = remaining[1];
                break;
            case 2: System.out.println("You have chosen: " + remaining[2]);
                movieChoice2 = remaining[2];
                break;
            case 3: System.out.println("You have chosen: " + remaining[3]);
                movieChoice2 = remaining[3];
                break;
            default: System.out.println("ERROR: " + choice2 + movieChoice2);
            System.exit(0);
                break;
        }
        }
    }
}