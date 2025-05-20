


public class Linear {
   
   public static void main(String[] args) {
      
        int [] array = {1,2,3,45};
        int index = linear(array, 45);

        if(index != -1){
            System.out.println("Element at index ;" +index);
        }else{
            System.out.println("Element not found");
        }
   }

    public  static int linear(int [] arr,int num){
       
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return arr[i];
            }
        }
       return -1;
    }

}


/*one element at a time 
 * run time -o(n)
 * 
 * Disadvantage
 *   -slow for large dataset
 * 
 * Advantages
 *   Fast for searches of small to medium data sets 
 *   Does not need to sorted
 *   Usefull for data structre that do not have random access 
 */