public class Selection {
    
    //(o)n2 time complexity
    //**  box 1 box2 checks any min value is ther in the box  each itreation find minimum val and swao variables//
     public static void main(String[] args) {
         int array []= {7,20,30,4,5};
         selection(array);

        for (int elem : array) {
            System.out.println(elem);
        }
     }

    public static void selection (int [] array){
         
        for(int i=0; i< array.length - 1; i++){
            int min = i;    //min value track and swap 
            for(int j= i + 1; j< array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }

                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            
            }
        }

       
        
    }
}
