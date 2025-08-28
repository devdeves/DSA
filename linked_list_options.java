class MyLinkedList {
    private class Node{
        int val;    // the data value which we going to store in this 
        Node next ; // intialise the pointer for next variable 
        Node (int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head ;
    private int size ;

    public MyLinkedList() {
        this.head  = null ;
        this.size  = 0 ;
    }

    
    public int get(int index) {
        if(index >= size || index < 0 )return -1;
        int counter = 0;
        Node curr = head;
        while(counter < index){
            curr = curr.next;
            counter++;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head ;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if(head == null){
            head = newNode; // this condition hande the is LL has 
                                        //now values next point on first node  
        }else{
            Node curr = head ;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
         size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size || index < 0) return ;
        if(index == 0){ addAtHead(val); return ;}
        if(index == size){ addAtTail(val); return ;}

        int counter = 0;
        Node curr = head ;
        while(counter < index - 1){
            curr = curr.next;
            counter++;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return ;
        }
        if(index == 0){
            head = head.next;
            size--; 
            return;
        }
        Node curr = head ;
        int counter = 0;
        while(counter < index - 1) {
            curr = curr.next;
            counter++;
        }
        curr.next  = curr.next.next;
        size--;
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