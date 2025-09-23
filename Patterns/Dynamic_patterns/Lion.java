public class Lion {
    public static void main(String[] args) {
          int n = 5;
          check(n);   
    }

    public static void check(int n){
        for(int row = 1; row <= n; row++){


            for(int space = 1; space <= row - 1; space++){
                System.out.print(" ");
            }

            for(int col = 1; col <= n - (row - 1); col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
