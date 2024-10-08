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



//adding elements in the array

// Declare an integer array of 10 elements.
int[] intArray = new int[10];

// The array currently contains 0 elements
int length = 0;

// Add elements at the first 6 indexes of the Array.
for(int i = 0; i < 6; i++) {
    intArray[length] = i;
    length++;
}