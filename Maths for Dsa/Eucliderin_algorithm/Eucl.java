// advance for finding gcd lik (a % b),b - a > b;
//                             a,(b % a) - b > a;  untill it gets 0;
public class Eucl {
 
    
   public static void main(String[] args) {
       int a = 5;
       int b = 10;

       System.out.println(gcd(a,b));
   }
    public static int gcd(int a, int b){

        while( a > 0 && b > 0 ){
           
            if (a > b) {
                a = a % b;
            }else{
                b = b % a;
            }

        }

      if(a == 0) return b;

      return  a;
    }
}
