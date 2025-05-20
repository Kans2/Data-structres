
public class Digit {
    
public static void main(String[] args) {
    int n = 98;
    
    System.out.println(digit(n));
}
 
    public static int digit(int n){

        if(n < 10){
            return n;
        }

     
       int count = 0;
       int sum =0;
        while( n != 0){
           
            int d = n % 10;
            System.out.println("the digits are .." + d);
            sum += d;
            n = n / 10;


        }
        
        return sum;
    
    }
}
