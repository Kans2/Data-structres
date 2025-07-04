public class Reverse {
    
   public static void main(String[] args) {
       int n = 7354;
       System.out.println(reverse(n));
   }


    public static int reverse(int number){
      
       int reversenum = 0;
        while(number != 0){
            int digit = number % 10;
            if(reversenum > Integer.MAX_VALUE / 10 || reversenum < Integer.MIN_VALUE / 10){
                return  0;
            }
            reversenum = reversenum * 10 + digit;   // 7 * 10 + 3 = 73 
            number = number/10;
        }

        return reversenum;
    }
}
