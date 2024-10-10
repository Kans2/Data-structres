public class Main {
    public static void main(String[] args) {
        
    }

    public static Boolean validMountain(int [] arr){

        if(arr == null || arr.length < 3){
            return false;
        }


        int length = arr.length;
        int i =0;

        while ( i+ 1 < length && arr[i] < arr[i + 1] ) { 
            i++;
        }
        if(i ==0 || i  == length - 1 ){
            return false;
        }
        while(i + 1 < length && arr[i] > arr[i + 1]){
            i++;
        }
    
        return i == length-1;


    }
    
}
