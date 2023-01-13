
import java.util.*;


public class Collection {
    public int isSquare(int n){
        int i;
        for(i=0;i<=n;i++){
            if(i*i==n)
                return 1;
            break;
        }
        return 0;
    }
    public static int checkConcatenatedSum(int a, int catlen)
    {
        int isConcatenatedSum=1;
        int sum=0, tempn=a;
        do{
            int lastdigit=tempn%10;
            int tempsum=0;
            int tens=1;
            for(int i=1;i<=catlen;i++){
                tempsum+=(tens*lastdigit);
                tens*=10;
            }
            tempn=tempn/10;
            sum+=tempsum;
        }
        while(tempn>=1);
        if(sum!=a)
            isConcatenatedSum=0;
        return isConcatenatedSum;
    }
    
    public static void main(String[] args) {
        int n,catlen,a;
        scanner in=new scanner(System.in);
        System.out.println("Enter n and catlen and a");
        n=in.nextint();
        catlen=in.nextint();
        a=in.nextint();
        
        System.out.println(isSquare(int n));
         System.out.println(checkConcatenatedSum(int a, int catlen))
       
    }
    
}
