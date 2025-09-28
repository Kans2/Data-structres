public class PtnR {
    public static void main(String[] args) {
        int n = 5;
        check(n);
    }

    public static void check(int n) {
        for (int row = n; row >= 1; row--) {
            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // stars and spaces
            for (int col = 1; col <= (row * 2) - 1; col++) {
                if (col == 1 || col == (row * 2) - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // move to next line
            System.out.println();
        }
    }
}

