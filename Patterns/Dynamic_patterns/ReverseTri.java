public class ReverseTri {
    public static void main(String[] args) {
        int n = 5;
        check(n);
    }

    //n- (row- 1) = 5 - (1 - 1) = 5- 0 = 5;
    public static void check(int n){
    

for (int row = n; row >= 1; row--) {
    // print spaces
    for (int space = 1; space <= n - row; space++) {
        System.out.print(" ");
    }
    // print stars
    for (int col = 1; col <= (2 * row )- 1; col++) {  // 2 * 1 -1 = 2 * 0 
        System.out.print("*");
    }
    System.out.println();
}

    }
}
