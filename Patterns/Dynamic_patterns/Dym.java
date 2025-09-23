public class Dym{
   public static void main(String[] args) {
       int n= 5;

       dy(n);
   }
    public static  void dy(int n){

        // for(int row = 1; row <=n; row++){
        //    // int printvalue = row % 2 == 0 ? 0 : 1;
        //         for(int col = 1; col <= row; col++){  //row times 

        //           //System.out.print(col );
        //           System.out.print(row );
        //           //System.out.print(printvalue + " ");   ptn-e
        //           //printvalue = printvalue == 0 ? 1 : 0;  ptn - e
        //           //System.out.print("*");

                

        //         }
                
        // System.out.println();

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        }

    }