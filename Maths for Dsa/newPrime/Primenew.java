public class Primenew {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(isPrime(N));
    }

    public static boolean  isPrime(int N){
       int count = 0;
        for(int i=1; i * i <= N; i++){
            if(N % i == 0){
                 count++;
                 if((N / i) != i) count++;  // stop when same number occurs
            }
        }
        
        if(count == 2){
            return true;
        }else{
            return false;
        }

       
        
    }

    


}
