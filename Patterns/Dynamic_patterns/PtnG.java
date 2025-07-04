public class PtnG {
    public static void main(String[] args) {
        int n = 5;
        g(n);
    }
      public static  void g(int n){
         int printvalue = 1;    
        for(int row=1; row<=n; row++){
            
            for(int col=1; col <= row; col++){
                System.out.print(printvalue++);
            }
            System.out.println();
        }
            
      }

}
