public class Ins {
 

    public static void main(String[] args) {
        int [] arr= new int [9];
        int position = 4;
        int value = 80;

       int length = 0;

       for(int i = 0; i <= 7; i++){
          arr[length] = i;
          length++;
       }

      





        length =  insertelements(arr, position, value, length);

        for(int i =0; i< length; i++){
            System.out.println(arr[i]);
        }


    }
    //insert any where in array in order we need to right shift elemnts were we  want to insert .

    public static int insertelements(int [] arr ,int position , int value,int length){

        //debugging
        if(length >= arr.length)
{
    System.out.println("No space in array");
    return  length;
}
        for(int i = length - 1; i >= position; i--){

            arr[ i + 1] = arr[i];
        }

        //if that position occur place the value

        arr[position ]  = value;  //because it start from 0

        return  length + 1;
        
        

    }
}





















        
























































































































































































































































































































































































































































































































































































































































