public class Arm {
    
   public static void main(String[] args) {
       int n = 153;

       System.out.println(isarm(n));
   }

    public static boolean isarm(int n){
        
         if(n == 1){
            return true;
        }
       
        int original = n;
        int sum = 0;
        while (n != 0){
                
            int digit = n % 10;
            sum += (digit * digit * digit);
            n = n / 10;

        }

        if(original == sum){
            return true;
        }

        return false;
    }
}
