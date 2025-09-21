public class Sample {


    public static void main(String[] args) {
        int N = 5602;

        System.out.println(digitPrime(N));
    }
    public static int digitPrime(int N) {
        // code here
        if(N < 10){
            if(isPrime(N)){
                return 1;
            }else{
                return 0;
            }
        }
        
        int sum = 0;
        
        while(N > 0){
            int digit = N % 10;
            sum += digit;
            N = N / 10;
        }
        
    
       
    return digitPrime(sum); 
        
    }
    
    
    public static boolean isPrime(int n){
        if( n == 1 || n == 0){
            return false;
        }
        int count = 0;
        
        for(int i= 1; i <= n; i++){
            if( n % i == 0){
                count++;
            }
        }
        
        if(count == 2){
            return true;
        }
        
        return false;
    }
}