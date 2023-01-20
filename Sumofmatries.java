
package sumofmatries;
import java.util.*;

public class Sumofmatries {

    public static void main(String[] args) {
         int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n  = in.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Input elements of first matrix");
        for (  c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array1[c][d] = in.nextInt();

        System.out.println("Input the elements of second matrix");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array2[c][d] = in.nextInt();

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                sum[c][d] = array1[c][d] + array2[c][d];

        System.out.println("Sum of the matrices:-");

        for ( c = 0 ; c < m ; c++ )
        {
            for ( d = 0 ; d < n ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
        
       
    }
    
}
class display{
    static void main(String[] args){
         //To find a common integer between the following arrays
            int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
            int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

            System.out.println("Array1 : "+Arrays.toString(array1));
            System.out.println("Array2 : "+Arrays.toString(array2));


            for (int i = 0; i < array1.length; i++)
            {
                for (int j = 0; j < array2.length; j++)
                {
                    if(array1[i] == (array2[j]))
                    {

                        System.out.println("Common element is : "+(array1[i]));
                    }
                }
            }


    }
  
    }

    
    