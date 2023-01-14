
package movie;
import java.util.*;

public class Movie {
String  title;
String  studio;
String  rating;
Movie(String t,String s, String r){
    this.title=t;
    this.studio=s;
    this.rating=r;
    
}
Movie(String t, String s){
    this.title=t;
    this.studio=s;
    this.rating="PG";
    
}
    public static  Movie []getPG(Movie[]mov) { 
        Movie[] pgMov =new Movie[mov.length];
        int j=0;
        for(int i=0;i < mov.length;i++)
            if(mov[i].rating.equals("PG")){
                pgMov[j]=mov[i];
                j++;
                
            }
        return mov;
        
     
    }
    Movie mov= new Movie ("Avatar","Mavric production","PG-10");
     public static  void main (String args[]){
         
            System.out.println();
     }
         
     
}
