public class Main{
    public static void main(String[] args){
        
    }

    public int removeDublicates(int [] nums){
        int length = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[length] != nums[i]){
                length++;
                nums[length]= nums[i];

            }
        }
        return length + 1;
    }
}