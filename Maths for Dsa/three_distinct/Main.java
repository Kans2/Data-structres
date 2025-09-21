// User function Template for Java

public class Main{
    public static void main(String[] args) {
        long N = 9;

        System.out.println(hasThreePrimeFac(N));
    }
    public static int hasThreePrimeFac(Long N) {
        // code here
    int count = 0;
      for(long i = 1; i <= N; i++){
         if(N % i == 0){
             if(isPrime(i)){
                 count++;
                  while (N % i == 0) {
                N /= i;
              }
             }
         }
      }
      
      if(count == 3){
          return 1;
      }else{
          return 0;
      }
        
    }
    
    public static boolean isPrime(long n){
        for(long i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}


