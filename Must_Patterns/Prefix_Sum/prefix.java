public class prefix {
   public static void main(String[] args) {
        
    int [] arr = { 1,2,3,4,5};  // 1= 2=3 , 3= 3 = 6, 6= 4 = 10, 10+ 5 = 15, {1,3,6,10,15}

    int [] prefixsum = new int[arr.length];
    
    prefixsum[0] = arr[0];

    for(int i= 1; i < prefixsum.length; i++){
        
        prefixsum[i] = prefixsum[i - 1] + arr[i];
    }


    for(int e : prefixsum){
        System.out.print(e + " ");
    }
   }











}
