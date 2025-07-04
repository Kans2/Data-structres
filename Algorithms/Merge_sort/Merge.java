public class Merge {
    
//divide and merge


public static void main(String[] args) {
    int [] array = {8,2,4,5,7,2,1};
    msort(array);

    for(int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
    }
}

public static void msort(int[] array){  
    //main merge
   int length = array.length;

   if(length <= 1) return; //base case


   int middle = length / 2;
   int [] leftsubarray = new int[middle];
   int [] rightsubarray = new int [length - middle]; 

   int i =0; //left array;
   int j =0; //right array

   for(; i < length; i++){
      
    if(i < middle) {
        leftsubarray[i] = array[i];
    }else{
        rightsubarray[j] = array[i];
        j++;    
    } 



    
   }

   msort(leftsubarray); //recursive divide again and again
   msort(rightsubarray); //recursive divide again and again
   merge(leftsubarray,rightsubarray,array);




      
}

public static void merge(int [] leftsubarray,int [] rightsubarray,int temparray[]){  //divide into sub arrays
    //fisrt say full of array is divided and both  sub arrays named left and right each array has low and high in the right array continous part of that so we assume mid + 1 to high in right array and we use pointers to set to track the like left and right

  

     int leftsize = temparray.length / 2;
     int rightsize = temparray.length - leftsize;

      int i =0; int l =0; int r =0;

      while (l < leftsize && r < rightsize) { 
          if(leftsubarray[l] < rightsubarray[r]){ //comparing or actual sorting 
               temparray[i] = leftsubarray[l];
               i++;
               l++;
          }else{
            temparray[i] = rightsubarray[r];
            i++;
            r++;
          }
      }

      while(l < leftsize){
        temparray[i] = leftsubarray[l];
        i++;
        l++;
      }

      while(r < rightsize){
        temparray[i] = rightsubarray[r];
        i++;
        r++;
      }





}
}
