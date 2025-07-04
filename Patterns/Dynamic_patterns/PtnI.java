public class PtnI {

    public static void main(String[] args) {
        int n = 5;
        i(n);
    }
    public static void i(int n){
         
        for(int row = 1; row <= n; row++){
             int del =  n- (row - 1);
            for (int col = 1; col <= del; col++) {
                //System.out.print(col);
                System.out.print(del);
            }

            System.out.println();
        }
    }
}
