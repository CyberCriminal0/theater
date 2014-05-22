/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eller.theater;

import static eller.theater.Movie.numMovies;

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
        
        System.out.println("Hello user -- there are currently "+ numMovies + " movies showing:");
        System.out.println("1: "+SonOfGodzilla.getInfo());
        System.out.println("2: "+Interstella5555.getInfo());
        System.out.println("2: "+MontyPythonAndTheHolyGrail.getInfo());
        System.out.println("3: "+KindergartetenCop.getInfo());
        // you have to write the getInfo method so that it returns all the info of the movie
        // getInfo() will be in the Movie class, and it returns a user-friendly String comprised
        // of the important info of the movie (concatenate the gets you've already written)
    }
}