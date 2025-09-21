import java.util.*;
public class Main {
    // User function Template for Java


    public static void main(String[] args) {
        long n = 2;
        System.out.println(sum_of_square_oddNumbers(n));
    }

    public static long sum_of_square_oddNumbers(long n) {
        // Code here
        long sum = 0;
       ArrayList<Long> list = new ArrayList<>();
       
       for(long i = 1; list.size() < n; i++){
           if(i % 2 != 0){
               list.add(i);
           }
       }
       
       for(long i= 1; i <= n; i++){
          long digit = list.get((int)(i - 1)); //1 
          long squre = digit * digit;
          sum += squre ;
       }
       
       return sum;
       
    }
}
