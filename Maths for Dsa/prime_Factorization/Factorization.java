
import java.util.ArrayList;

public class Factorization {
    //find prime factors of a number unique
    //squrtn why beacuse  a combination of co-factor is n ; 

    public static void main(String[] args) {
        int n = 36;

        System.out.println(primeFactors(n));
    }

    public static boolean  isprime(int N){
       int count = 0;

        for(int i=1 ; i * i <= N; i++){

            if(N % i == 0){
               count++;
               if( (N/ i) != i) count++;
            }
        }

        if(count == 2){
            return true;
        }else{
            return false;
        }


      
    }

    public static ArrayList<Integer> primeFactors(int n){
        //i * b = n;
        //b= n/i;
       // Because looping only to √n means you only see the smaller half of the factor pairs.

       //The co-factor n / i makes sure you also catch the larger half (which may be prime).

       //Factors always come in pairs → (i, n/i)

       //We only loop up to √n (to avoid duplicates).

       //To catch all prime factors, we check both i and n/i.
        ArrayList <Integer> list = new ArrayList<>();
        
      

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            if (isprime(i)) {
                list.add(i);
            }
            if (isprime(n / i)) {
                list.add(n / i);
            }
        }
    }

        // Special case: if n itself is prime, include it
    if (isprime(n)) {
        list.add(n);
    }

       

        return list;
    }
}
