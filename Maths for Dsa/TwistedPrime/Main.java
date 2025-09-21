public class Main {
    public static void main(String[] args) {
        int N = 97;
        System.out.println(isTwistedPrime(N));
    }

    
    public static int isTwistedPrime(int N) {
        // code here
        int reverse = 0;
        
        while ( N > 0){
            int digit = N % 10;
            reverse = reverse * 10 + digit ;
            N = N/ 10;
        }
        
        if(isPrime(N) && isPrime( reverse)){
            return 1;
        }
        
    return 0;
        
 
    }
    
    public static boolean isPrime(int n){
        if(n == 1 || n == 0){
            return false;
        }
        int count = 0;
        
        for(int i= 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        
        if(count == 2){
            return true;
        }
        
        return false;
    }
}

// User function Template for Java

class Solution {
    
    int isTwistedPrime(int N) {
        // code here
        int reverse = 0;
        int original = N;
        
        while ( N > 0){
            int digit = N % 10;
            reverse = reverse * 10 + digit ;
            N = N/ 10;
        }
        
        if(isPrime(original) && isPrime( reverse)){
            return 1;
        }
        
    return 0;
        
 
    }
    
    public static boolean isPrime(int n){
        
       for(int i=2; i * i <= n; i++){
           if(n % i == 0){
               return false;
           }
       }
       
       return true;
    }
}
