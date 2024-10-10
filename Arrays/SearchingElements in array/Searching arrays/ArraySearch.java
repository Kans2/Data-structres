public class ArraySearch {
    public static void main(String[] args) {

      int [] nums = new int[10];

      int length =0;

      for(int i=0; i<10; i++){
           
        nums[length] = i;
        length++;
        
      }
       

      System.out.println("Does the array have 4:"+ArraySearch.linearSearch(nums, length, 5));
      System.out.println("(Does the array have 30)+"+ArraySearch.linearSearch(nums, length, 50));


        
    }

    //linearsearch algorithm;
    public static boolean linearSearch(int [] nums,int length,int element){

       if(nums == null || length == 0){
        return false;
       }


       for(int i=0; i<length; i++){
        if(nums[i] == element){
            return true;
        }
       }
   return false;

    }
}
