
package colgen;
import java.util.*;

public class ColGen<T,K> {
    T id;
    K studkey;
    
    
    
    ColGen(T t,K k){
        this.id=t;
        this.studkey=k;
    }
    <T> void displayArray(T[]arr){
        for(T x:arr){
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        ColGen<String,Integer> gc=new ColGen<String,Integer>("ETH",251);
        ColGen<Double,Integer> salary=new ColGen<Double,Integer>(34.76,251);
        String x;
        System.out.println("");
        LinkedList<String> names=new LinkedList<String>();
        names.add("ABCD");
                names.add("BCD");
                 System.out.println(names);
        
    }
       
    }
    

