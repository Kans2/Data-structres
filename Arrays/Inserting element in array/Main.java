

public class Main {
    public static void main(String[] args) {
        int [] sample = new int[8];

        int length =0;

        for(int i =0; i<5; i++){
             sample[length] = i;
             length++;
        }
        
        
        for (int i =0; i< sample.length; i++) {
            
            System.out.println("index is"+ " "+ i + " " + "contains" + sample[i]);
          

        }
        System.out.println("*************************************************************");


         //inserting the elemnts from end of an array
         sample[length] = 10;

          
        //print
         for(int i=0; i<sample.length; i++){
            
            System.out.println("index is "+ " "+ i + " " + "contains" + sample[i]);

         }

         System.out.println("*************************************************************");

         
        //inserting elememts into the start of the array
        for(int i=3; i >= 0; i--){
            sample[i + 1]= sample[i]; 
        }
        sample[0] = 20;

       //print
       for (int i =0; i< sample.length; i++) {
            
        System.out.println("index is"+ " "+ i + " " + "contains" + sample[i]); 
    } 
        
    //insert element into anyware in array
    
    System.out.println("*************************************************************");

    for(int i= 6 ; i >= 6; i--){
        sample[i + 1] = sample[i];
    }

    sample[6] = 30;

     //print
     for (int i =0; i< sample.length; i++) {
            
        System.out.println("index is"+ " "+ i + " " + "contains" + sample[i]); 
    } 


    }
    
}
