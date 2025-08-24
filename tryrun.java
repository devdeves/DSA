class dryrun{    
    private Node {
        int val;
        Node next;
        Node (int val){
            this.val = val; // which point currect object and set val;
        }
    }

    Node head;
    int size = 0;

    public void addAtTail(int val){
        Node newNode = new Node(val);

        if(head == null){ head = newNode; }
        else{
            Node currentNode = head;

            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            size++;
         }

    }

}