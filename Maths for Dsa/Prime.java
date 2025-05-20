public class Prime{
    
  //efficiant for small numbers
   public static void main(String[] args) {
       int n = 10;

       System.out.println(isPrime(n));
   }

    public static String isPrime (int n){
       if(n <= 1){
        return "non prime";
       }

       for(int i=2; i * i <= n; i++){
              
        if(n % i == 0){
            return "non prime";
        }

       }

       return  "prime";
    }
}


// x -> [ 2 to root x ]
//x = 16 