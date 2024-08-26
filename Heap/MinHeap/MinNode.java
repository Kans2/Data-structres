
import java.util.ArrayList;

public class  MinNode{
      
    ArrayList<Integer> heap;    //node store in the arrayList
    //attributes

    public MinNode(){
        heap = new ArrayList<>();
    }


    //methods
    public  void  insert(int value){

        heap.add(value);
        int index= heap.size() -1;  //newly entered element position
        Heapifyup(index);           //puthusa enter pana crt less or max set
    }
    

    //Heapify
    private void Heapifyup(int index){
            
        int parentIndex = (index -1)/2;  //

        if(index > 0 && heap.get(index) < heap.get(parentIndex)){
            swap(index,parentIndex);
            Heapifyup(parentIndex);
        }
    }
    
    //Swap
    private void swap(int i, int j){
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j,temp);
    }
    
    //print heap
    public void Print(){
        System.out.println(heap);

    }

}