public class patternW {
    public static void main(String[] args) {
        int n= 5;
        patternW(n);
    }

     public static void patternW(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int rowChange = row > n ? 2 * n - row : row;
            for (int col = 1; col <= 2 * n; col++) {
                if (col <= rowChange || col > (2 * n) - rowChange) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
