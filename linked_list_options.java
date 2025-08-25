
// Leetcode : https://leetcode.com/problems/design-linked-list/description/
//Design Linked List


class MyLinkedList {
    private class Node{
        int val;
        Node next;
        Node (int val){
            this.val = val;
            this.next = null;
        }
    }
    private Node head;
    private int size = 0;

    public MyLinkedList() {
        head = null;
        size = 0; 
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node curr = head;
        for(int i = 0 ; i < index ; i++){
            curr = curr.next
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        Node head = newNode;
        newNode.next = head;
        size++;
    }
    
    // public void addAtTail(int val){
    //     Node newNode = new Node(val);

    //     if(head == null){ head = newNode; }
    //     else{
    //         Node currentNode = head;

    //         while(currentNode.next != null){
    //             currentNode = currentNode.next;
    //         }
    //         currentNode.next = newNode;
    //         size++;
    //      }

    // }
    public void addAtIndex(int index, int val) {
        
    }
    
    public void deleteAtIndex(int index) {
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */