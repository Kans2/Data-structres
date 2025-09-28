

public class Main {
    
public static void main(String[] args) {
    
}
public  static Long powerGame(long X, long N) {
        // code here
        
      long expo =  N;
      long base = X;
      long first = 0;
      long last = 0;
      long ans = 1;
      long join = 0;
      
      //power expo ku  n set pananum 
      //based on n set until 5 like 1 , 2,3 4, 5
      //first digit and last digit mtm extract pananum
      //all ithaium join pananum
      
    while( expo > 0){
         if(expo % 2 != 0){
             ans *= base; //power value final  
             expo--;
         }else{
             base = base * base;
             expo = expo/ 2;
         }
    }


        
    }

}