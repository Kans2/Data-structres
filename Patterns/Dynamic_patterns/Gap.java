public class Gap {
    public static void main(String[] args) {
        int n = 6;
        checking(n);
    }

    //      *
    //    *   *
    //  *       *
    // *         *
    //* * * * * * *

    public static void checking(int n) {
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // print stars and gaps
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == (2 * row - 1) || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // new line after each row
            System.out.println();
        }
    }
}
