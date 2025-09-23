public class Triangle {
    public static void main(String[] args) {
        int n= 6;
        triangle(n);
    }

    public static void triangle(int n){
        int count = 1;

        for(int row = 1; row <= n; row++){
            for(int space = 1; space <= n - row; space++ ){
                System.out.print(" ");
            }
            
            for(int col= 1; col <= count; col++){
                System.out.print("*");
            }
            count += 2;
            System.out.println();
        }
    }
}
