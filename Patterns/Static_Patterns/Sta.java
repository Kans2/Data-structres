public class Sta{


//tip - 1 no of lines or row print in outer loop
//tip -2 no of column print in inner loop 
//tip -3 always start with 1
//tip -4 if row and column not equal it is a Dynamic pattern find the formula



public static void main(String[] args) {
    int n= 5;
    staptn(n);

   
}


    public static void staptn(int n){
            
        for(int row = 1; row <= n; row++){
              
          
            for(int col = 1; col <= n; col++){
                //System.out.print("*" + " ");

                System.out.print(row + " "); 

                //System.out.print(col);

            }
            System.out.println();
        }

    }


    int rows = matrix.length;
int cols = matrix[0].length;

int[] array = new int[rows * cols]; // flattened version of matrix
int index = 0;

for (int row = 0; row < rows; row++) {
    for (int col = 0; col < cols; col++) {
        array[index++] = matrix[row][col]; // just flattening row by row
    }
}

}

//first 1 <= 3 true so go to inner loop in that check col print completely then go to agin outer loop check then go to inner loop 
//once at a time of iterative