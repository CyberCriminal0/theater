package eller.theater;

import java.util.Scanner;

/**
 *
 * @author n352991
 */
public class Movie {
    String title, tagline, starring;
    double start, duration, end, admission;
    static int numMovies;
    public Movie (String ti, String ta, String sta, double st, double dur, double e, double adm){
    title = ti;
    tagline = ta;
    starring = sta;
    start = st;
    duration = dur;
    end = e;
    admission = adm;
    numMovies++;
}
//Creates methods for getting variables for each movie object
    public String getTitle(){
        return title;
    }
    public String getTagline(){
        return tagline;
    }
    public String getStar(){
        return starring;
    }
    public double getStart(){
        return start;
    }
    public double getDuration(){
        return duration;
    }
    public double getEnd(){
        return end;
    }
    public double getAdmission(){
        return admission;
    }
    public int getMovies(){
        return numMovies;
    }
    public String getStartString(){
        
        String stringBack = String.valueOf(start);
        return stringBack;
    }
    public String getInfo(){
        String info = (this.getTitle()+ " " + this.getTagline()+ " Starring: " + this.getStar() + " Starting at: " + 
            this.getStart() + " and ending at: " + getEnd());
        return info;
    }
    
//Creates methods to set movie object variables for manual edits
    public void setTitle(String t){
        title=t;
    }
    public void setTagline(String tag){
        tagline=tag;
    }
    public void setStar(String star){
        starring=star;
    }
    public void setStart(double sta){
        start=sta;
    }
    public void setDuration(double dura){
        duration=dura;
    }
    public void setEnd(double en){
        end=en;
    }
    public void setAdmission(double admi){
        admission=admi;
    }

    
    //time conversion method
    
    public void Time(String startTime, double length){
        int startH = Integer.parseInt(startTime.substring(0,2));
        int startM = Integer.parseInt(startTime.substring(3));
        int movieLength = (int)(length*60);
        int endM = movieLength%60 + startM;
        if(endM==60){
            endM=00;
            startH++;
        }
        int endHour = movieLength/60 + startH;
        System.out.println("The movie is going to end at: "+endHour+":"+endM);
        if(endM >= 60){
            endHour++;
            endM %= 60;
        }
        
    }
    
    //comparison method
    public void compare(){
        //this method should not have any user interaction -- in fact, this class
        //shouldn't have any interaction with the user -- no system.out.anything
        
        // compare should take in a movie object
        // and compare that movie object's end time with the start time
        // of this movie object.  
        
        // if you want to display the movies, it is not the responsibility
        // of any particular movie object to do that -- it is the responsibility of the theater.
        int startMin, startHour, endMin, endHour;
        System.out.println("The movies currently showing are...");
        
        System.out.println("What time does the first movie start? (XX.XX) format");
        double time1 = new Scanner(System.in).nextDouble();
        String convertTime1 = String.valueOf(time1);
        System.out.println(time1);
        
        
    }
}