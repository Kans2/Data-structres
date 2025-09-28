public class patternV{

    public static void main(String[] args) {
        int n = 5;
        patternV(n);
    }
    
    public static void patternV(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int rowChange = row > n ? 2 * n - (row - 1) : row;
            for (int col = 1; col <= 2 * n; col++) {
                if (col <= n - rowChange + 1 || col > n + rowChange - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
