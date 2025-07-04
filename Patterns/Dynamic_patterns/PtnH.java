public class PtnH {
    
    public static void main(String[] args) {
        int n = 7;
        h(n);
    }

    public static void  h(int n){
          
        for (int row = 1; row <= n; row++) {
            int del =  n- (row - 1);
            for(int col = 1; col <= del; col++){
              

              System.out.print(" *" + " ");
            }   
            System.out.println();
        }
    }
}
