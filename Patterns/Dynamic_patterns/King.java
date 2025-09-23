public class King {
    public static void main(String[] args) {
        int n = 7;

        check(n);
    }
    //       *
    //     * *
    // *  *  *
    //


    public static void check (int n){
        for(int row = 1; row <= n; row++){
            for(int space = 1; space <= n - row; space++){
                System.out.print("$");
            }

            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
