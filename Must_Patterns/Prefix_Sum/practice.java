public class practice {
    

    //given an array nums and query (l,r) , return the sum of elements from index l to r,inclusive 
    //[1,2,3,4,5,10] query= (1,3) (2 ,4) ( 4, 5); 
    //9,


     public static void main(String[] args) {
         
     int [] nums = {1,2,3,4,5,10};    

     int [] [] queries = {
        {1,3},
        {2,4},
        { 4,5}
     };
 

  int [] totalsum = prefixsum(nums);


  for(int [] query : queries){

   int l = query[0];
   int r = query[1];


     try {
                int sum = queryindex(totalsum, l, r);
                System.out.println("Sum for query (" + l + ", " + r + "): " + sum);
            } catch (IllegalArgumentException e) {
                System.err.println("Error processing query (" + l + ", " + r + "): " + e.getMessage());
            }
  }



   



    }
    
       

    public static int [] prefixsum(int [] nums ){
           
           
    int [] prefixsum = new int[nums.length];
    
    prefixsum[0] = nums[0];

    for(int i= 1; i < prefixsum.length; i++){
        
        prefixsum[i] = prefixsum[i - 1] + nums[i];
    }

    return prefixsum;
    }
    


    //queries

    public static int queryindex(int [] prefixsum, int l, int r){

     if(l == 0){
      return prefixsum[r];
     }else{

       return prefixsum[r] - prefixsum[l - 1];
     }


    }




     

}
