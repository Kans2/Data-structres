public class Rotate{

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        
     

       
    }


        public static int [] rotate(int [] nums){

     int left = 0;
     int right = nums.length - 1;
         

         while(left < right ){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

         }
 
         return nums;
    }


   
}