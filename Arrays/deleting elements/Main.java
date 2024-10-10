public class Main {
    public static void main(String[] args) {
        int [] sample = new int[7];

        int length =0;

        for(int i =0; i<6; i++){
             sample[length] = i;
             length++;
        }

        for (int i =0; i< sample.length; i++) {
            
            System.out.println("index is"+ " "+ i + " " + "contains" + sample[i]);
        }



        //deleting from 1 index to shift the element to left;
        //deleting from an end 
/* 

        System.out.println("*********************Ending element has been delete*************");
        
        length--;

        for (int i =0; i< length; i++) {
            
            System.out.println("index is"+ " "+ i + " " + "contains" + sample[i]);
        }

         */
        System.out.println("*********************Starting element has been delete left shift remaining*************");
        //deleting the starting of index and left shift the elements

        for(int i=1; i< length; i++){
            sample[i - 1] = sample[i];
        }
        
       length--;
        for (int i =0; i< length; i++) {
            
            System.out.println("index is"+ " "+ i + " " + "contains" + sample[i]);
        }

    }   
}

