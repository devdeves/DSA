
// Learn LL step by step 
class StaticLinkedList {
    // Inner class Node
    private class Node {
        int val;       // stores data (the value in this node)
        Node next;     // pointer reference to the next node 

        Node(int val) { // constructor for Node
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Default constructor
    public StaticLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Constructor that builds LL from array
    public StaticLinkedList(int[] values) {
        if (values.length == 0) {
            head = null;
            size = 0;
            return;
        }
        head = new Node(values[0]);
        int counter = 0 ;
        Node curr = head;
         while(counter < values.length){
            curr.next = new Node(values[counter]);
            curr = curr.next;
            size++;
            counter++;
         }
     
    }

    // Print the linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Test class with main method
    public static void main(String[] args) {
        StaticLinkedList list = new StaticLinkedList(new int[]{5, 10, 15, 20});
        list.printList();  // Output: 5 -> 10 -> 15 -> 20 -> null
    }
}
