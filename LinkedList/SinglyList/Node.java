

public class Node {
   private int val;
   private Node next;

    Node(int val){
        this.val = val;
    }

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }


    //getter and setter method
      // Getter and setter for 'val'
      public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    // Getter and setter for 'next'
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Optional: toString method for easier debugging
    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
}
