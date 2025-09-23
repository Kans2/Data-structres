public class PtnH {
    
    public static void main(String[] args) {
        int n = 7;
        h(n);
    }

    public static void  h(int n){
          for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - (row - 1); col++){
                   System.out.print(n-(row-1));// * for reverse printing
            }
            System.out.println("");
          }
        
    }
}
