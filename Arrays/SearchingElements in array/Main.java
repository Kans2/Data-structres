public class Main {
    public static void main(String[] args) {
        //common searching algo for edge case in arr if the element place return true

    int[] array ={3,4,56,8};
    int length = 3;
    int element = 56;

    System.out.println(linearSearch(array, length, element));
        
    }
    public static boolean linearSearch(int[] array, int length,int element){
        
       if (array == null  || array[length] == 0){
             return false;   
       }
       
       //if any element in array we return true
       for (int i=0; i<array.length; i++){
              
            if(array[i] == element){
                        return true;
            }
           
       }
             return false;
    }
    
}
