

public class NewLinkedList {


    public static void main(String[] args) {
        
        NewNode node1 = new NewNode(10);
        NewNode node2 = new NewNode(20);
        NewNode node3 = new NewNode(30);
        NewNode node4 = new NewNode(5);

        //inserting in middle
        NewNode node5 = new NewNode(25);

        node1.next = node2;
        node2.next = node5;
        node4.next = node1;
        node5.next = node3;

        //head 

        NewNode head = node4;

        //traverse through linked list

        while ( head != null ) { 
             System.out.println(head.data);
             head = head.next;
        }

       
   
     
    

    }

  
}
