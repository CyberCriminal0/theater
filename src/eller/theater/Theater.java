/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eller.theater;

/**
 *
 * @author n352991
 */
public class Theater {
    public static void main (String[]args){
        //(String ti, String ta, String sta, double st, double dur, double e, double adm)
        Movie Test1 = new Movie("Test Movie", "Quite the Test", "Test Tester", 13.11, 90.0, 14.22, 55.55);
        System.out.println(Test1.getTitle());
        System.out.println(Test1.getMovies());
        Movie Test2 = new Movie("Test Movie", "Quite the Test", "Test Tester", 13.11, 90.0, 14.22, 55.55);
        System.out.println(Test1.getMovies());
    }
}