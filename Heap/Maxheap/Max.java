import  java.util.*;
public class Max{

   private ArrayList<Integer> maxHeap;  //stor the data in node

    public Max(){
        maxHeap = new ArrayList<>();       //initialize 
    }

    
    public  void insert(int value){

        maxHeap.add(value);
        int index = maxHeap.size() -1;
        HepifyUp(index);
    }
    
    //method for heapify
    private  void HepifyUp(int index){
        int parentIndex = (index-1) / 2;

        if(index > 0 && maxHeap.get(index)> maxHeap.get(parentIndex)){
            Swap(index, parentIndex);
            HepifyUp(index);
        }
    }
      
   //method for Heapifydown
      private void HeapifyDown(int index){

        int LeftChildIndex = 2 * index + 1;
        int RightChildIndex = 2 * index + 2;
        int largest = index;

        //check left is larger
        if (LeftChildIndex < maxHeap.size() && maxHeap.get(LeftChildIndex)>maxHeap.get(largest)){
            largest = LeftChildIndex;
        }
        
        //check if right larger
        if (RightChildIndex < maxHeap.size() && maxHeap.get(LeftChildIndex)> maxHeap.get(largest)) {
            largest = RightChildIndex;
        }
        
        if (largest != index) {
            Swap(index, largest);
            HeapifyDown(largest); // Continue heapifying down
        }



      }





    //Remove from top
    public int removeMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap.get(0);          // The root contains the maximum value
        int lastIndex = heap.size() - 1; // Index of the last element
        heap.set(0, heap.get(lastIndex)); // Move the last element to the root
        heap.remove(lastIndex);        // Remove the last element
        heapifyDown(0);                // Restore the max-heap property
        return max;
    }













    //Swap
    private void Swap(int i, int j){
      int temp = maxHeap.get(i);
      maxHeap.set(i,maxHeap.get(j));
      maxHeap.set(j, temp);
      
    }
     

    //Printthe heap
    public  void Print(){
        System.out.println(maxHeap);
    }


    public static void main(String[] args) {
        Max max = new Max();

        max.insert(50);
        max.insert(100);
        max.insert(200);
        max.insert(40);
        max.insert(10);
        max.insert(70);


        max.Print();

    }


}