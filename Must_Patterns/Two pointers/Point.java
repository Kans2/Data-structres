public class Point{
    //two pointer technoque work as anywere 
    //like in the start or end or middle.
     

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int target = 9;

        System.out.println(pairsum(arr, target));
    }
    public static boolean  pairsum(int [] arr,int target){
    

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println("The elemnt are :" + arr[left] + " " + arr[right]);
                return true;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return false;
    }
}