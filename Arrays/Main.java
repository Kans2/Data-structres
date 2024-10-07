class Solution {
    public void duplicateZeros(int[] arr) {
        
        
        int n = arr.length;
       
          
        for(int i=0; i<n; i++){
          
        System.out.println("Index" + i + " contains" + arr[i]);
            if(arr[i] == 0){
                
                //shifting elements from back loop
                for(int j = n-1; j > i; j--){
                    
                    arr[j] = arr[j - 1];
                    
                }
                //dublicate 0 add
                i++;
            
            }
          
            
               
            }
      
            
        
        
        
    }
}