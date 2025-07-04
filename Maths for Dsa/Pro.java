public class Pro{
  public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(arrSum(arr));
    }

   public static int arrSum(int [] arr){

        int sum =0;
         for(int num : arr){
            sum += num;
         }
        return sum;
   }
}