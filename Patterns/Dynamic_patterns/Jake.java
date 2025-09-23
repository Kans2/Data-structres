public class Jake {
    public static void main(String[] args) {
        int n= 5;
        print(n);
    }


    public static void print( int n){
          for(int row=1; row <= (2 * n) - 1; row++){

            int rowchange = row > n ? ( 2 * n) - row :row;

            for(int col=1; col<= rowchange; col++){
                System.out.print("*");
            }

            System.out.println(" ");
          }
    }
}
