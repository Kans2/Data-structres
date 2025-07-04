
public class Insert {

   //first place the value in temp and check left side if it is greater swap continue each iteration
    
   public static void main(String[] args) {
       
   }



    public static void insert(int[] array){
          for(int i = 1; i<array.length ; i++){
            int temp = array[i];
            for(int j=0; j < array.length ; j++){
                if(array[j] > array[j + 1]){
                      int temp = array[j];
                      array[j+ 1] = array[j];
                      array[j] = temp;
                }
            }
          }
    }
}
