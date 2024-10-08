
import java.util.Arrays;

public class Main {


   public static void merge(int nums1[], int m,int nums2[],int n){

           int index1 = m -1;
           int index2 = n- 1;
           int mergeIndex = m+n-1;

           while (index1 >= 0 && index2 >=0){
               
                //larger one with add back in nums1 arr

                if(nums1[index1] > nums2[index2]){
                    nums1[mergeIndex--] = nums1[index1--];
                }else{
                    nums1[mergeIndex--] = nums2[index2--];
                }
               
           }

           while (index2 >= 0) { 
               nums1[mergeIndex--]= nums2[index2--];
           }

   }






    public static void main(String[] args) {

        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {4,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

        // Start merging from the end of nums1 to avoid overwriting elements
        
        // No need to copy remaining elements from nums1 since they are already in place
    
    
}
}