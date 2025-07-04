public class Ptnj {
    public static void main(String[] args) {
        int n = 7;
        j(n);
    }

    public static void  j(int n){
          
        for (int row = 1; row <= (2 * n) - 1; row++) {
           int del = row > n ? (2 * n) - row : row;
            for(int col = 1; col <= del ; col++){
              
                System.out.print("*");

               
        
              
            }

              
                System.out.println();

        }
    }
}
