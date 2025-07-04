public class Odd{

    public static void main(String[] args) {
        int N = 7;

        System.out.println(odd(N));
    }
    public static int odd(int N){
               

        int num1;
        
       if( N % 2 == 0){
            num1 = N/ 2;
       }else{
           num1 = N/2 + 1;
       }
      
       return num1 * num1;
    }
}