public class Ice{


    public static void main(String[] args) {
        int n = 5;
        check(n);
    }

    public static void check(int n){
        int count = 1;
       for(int row = 1; row <= n; row ++){
        for(int col= 1; col <= n- (row - 1); col++){
            System.out.print(count);
            count++;
        }
        count = 1;
        System.out.println("");
       }
    }
}