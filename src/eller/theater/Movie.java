package eller.theater;
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
//get commands return given variables
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
    
//set commands edit or set existing variables  
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
    
    public void Time(String startTime, double length, String endTime){
        int SH = Integer.parseInt(startTime.substring(0,2));
    }
    
    public void compare(){
        int startMin, startHour, endMin, endHour;
        System.out.println("What time does the first movie start? (XX:XX) format");
        
    }
}