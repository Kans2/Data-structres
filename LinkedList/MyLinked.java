public class MyLinkedList {
    
    // Define a Node class to represent elements in the list
    private static class Node {
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
        }
    }
    
    private Node head;  // The head of the list
    private int size;   // Keeps track of the current size of the list
    
    // Constructor initializes the linked list
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    // Get the value of the node at the given index. Return -1 if the index is invalid.
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;  // Index is out of bounds
        }
        
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;  // Move to the next node
        }
        return current.val;
    }
    
    // Add a node of value val at the head of the list
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;  // Point new node to the current head
        head = newNode;       // Move head to point to the new node
        size++;               // Increase the size of the list
    }
    
    // Append a node of value val to the tail of the list
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;  // If list is empty, new node becomes the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // Traverse to the last node
            }
            current.next = newNode;  // Attach the new node at the tail
        }
        size++;  // Increase the size of the list
    }
    
    // Add a node of value val at the given index. If index is greater than the size, do nothing.
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;  // Index is out of bounds or exceeds the size
        }
        
        if (index == 0) {
            addAtHead(val);  // If index is 0, add at the head
            return;
        }
        
        Node newNode = new Node(val);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;  // Traverse to the node just before the insertion point
        }
        newNode.next = current.next;  // Point new node to the next of the current node
        current.next = newNode;       // Insert new node after current
        size++;                       // Increase the size of the list
    }
    
    // Delete the node at the given index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;  // Index is out of bounds
        }
        
        if (index == 0) {
            head = head.next;  // If deleting the head, just move head to the next node
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;  // Traverse to the node just before the deletion point
            }
            current.next = current.next.next;  // Bypass the node to delete it
        }
        size--;  // Decrease the size of the list
    }
}
