public class Main{
    public static void main(String [] args){
            int [] arr={1,2,3,4,5};
            int length = 6;

             
      

    }
    public int[] squreEven(int [] arr , int length){

        if(arr == null){
            return arr;
        }
        
       

        for(int i=0; i< length; i+=2){//do not check every index 
     
            arr[i] *= arr[i];



        }
        return  arr;
    }

    //rpeated deletion
    public int[] copyWithRemovedDuplicates(int[] nums) {
        
        // Check for edge cases.
        if (nums == null || nums.length == 0) {
            return nums;
        }
      
        // Count how many unique elements are in the Array.
        int uniqueNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            // An element should be counted as unique if it's the first
            // element in the Array, or is different to the one before it.
            if (i == 0 || nums[i] != nums[i - 1]) {
                uniqueNumbers++;
            }
        }
      
        // Create a result Array.
        int[] result = new int[uniqueNumbers];
      
        // Write the unique elements into the result Array.
        int positionInResult = 0;
        for (int i = 0; i < nums.length; i++) {
          // Same condition as in the previous loop. Except this time, we can write
          // each unique number into the result Array instead of just counting them.
            if (i == 0 || nums[i] != nums[i - 1]) {
                result[positionInResult] = nums[i];
                positionInResult++;
            }
        }
        return result;
      }
}