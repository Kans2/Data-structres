/* 
public class Binary {
    

    public static int Binary(int [] arr,int num){

    int l = 0;
    int h = arr.length - 1;
    
    int m = ( l + h )/ 2;
    
    if(num == arr[m]){
       return m;
    }else if( num < arr[m] ){
        return arr[m] - 1;
    }else if(num > arr[m]){
        return arr[m] + 1;
    }
    
    return 0;

    }
}
 */
/*search alogo position of target 
 * half of arr eliminate during each step
 * for large datasets
 */


 public class Binary {

    public static int binarySearch(int[] arr, int num) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2; // Prevents potential overflow

            if (num == arr[m]) {
                return m; // Found the number at index m
            } else if (num < arr[m]) {
                h = m - 1; // Search in the left half
            } else { // num > arr[m]
                l = m + 1; // Search in the right half
            }
        }

        return -1; // Number not found in the array
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 38;
        int index = binarySearch(sortedArray, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
