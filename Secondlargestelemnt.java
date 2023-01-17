
package secondlargestelemnt;
import java.util.*;
public class Secondlargestelemnt {
    public static int getSecondLargest(int[]arr,int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j=i+1;j<total; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                
            }
            }
        }
        return arr[total-2];
        
    }
    

  
    public static void main(String[] args) {
        int n,total, x;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the value of n");
        n = in.nextInt();
        System.out.println("Input the value of tatal");
         total = in.nextInt();
         int arr[]= new int[n];
         x=arr[total-2];
          System.out.println(x);
        
        
         
 

       
    }
    
}
