public class Sliding {
    //problem 
    //Max sum of Sub array k = 3 or 4 
    //using Sliding window approach time complexity is o(n);
   public static void main(String[] args) {
       int [] arr = {2,1,5,1,3,2};
       int k = 3;
       System.out.println(Subarr(arr, k));

    }

    public static int Subarr(int [] arr,int k){

             int length = arr.length;
             int maxSum = 0;
             int windowSum = 0;

             for(int i = 0; i < k; i++){
              
                  windowSum += arr[i];        
             }

             maxSum = windowSum;

             for(int j = k; j < length; j++){

                windowSum += arr[j] - arr[j - k];


                maxSum = Math.max(maxSum, windowSum);

             }
  

             return maxSum;
    }



}
