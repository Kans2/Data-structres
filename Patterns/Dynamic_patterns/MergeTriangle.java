public class MergeTriangle {
    public static void main(String[] args) {
        int n = 5;
        checking(n);
    }

    //row * 2 - 1; times will run 
    //space n - row =   5 - 1 = 4;
    //printing  5 - 5 - 1 = 
    public static void checking(int n){
     

for (int row = 1; row <= 2 * n - 1; row++) {
    int rowchange = row > n ? 2 * n - row : row; // increasing then decreasing
    
    // spaces
    for (int space = 1; space <= n - rowchange; space++) {
        System.out.print(" ");
    }
    // stars
    for (int col = 1; col <= 2 * rowchange - 1; col++) {
        System.out.print("*");
    }
    System.out.println();
}


    }
}
