public class LinkedListDemo {

    // Node definition
    static class Node {
        int data;
        Node next;

        public Node() {
            this.data = 0;
            this.next = null;
        }
    }

    // Static fields (shared globally)
    static Node root = null;
    static int size_of_ll = 0;

    // Insert a node at given position
    public static void insert_node(int position, int value) {
        if (position >= 1 && position <= size_of_ll + 1) {
            Node temp = new Node();
            temp.data = value;

            // Insert at head
            if (position == 1) {
                temp.next = root;
                root = temp;
            } else {
                int count = 1;
                Node prev = root;

                // Traverse till the previous node
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }

                temp.next = prev.next;
                prev.next = temp;
            }
            size_of_ll++;
        }
    }

    // Delete a node from given position
    public static void delete_node(int position) {
        if (position >= 1 && position <= size_of_ll) {
            Node temp = null;

            // Remove at head
            if (position == 1) {
                temp = root;
                root = root.next;
            } else {
                int count = 1;
                Node prev = root;

                // Traverse till the previous node
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }

                temp = prev.next;
                prev.next = prev.next.next;
            }
            size_of_ll--;
        }
    }

    // Print the linked list
    public static void print_ll() {
        Node temp = root;
        int flag = 0;

        while (temp != null) {
            if (flag == 0) {
                System.out.print(temp.data);
                flag = 1;
            } else {
                System.out.print(" " + temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        insert_node(1, 23);
        insert_node(2, 24);
        insert_node(1, 10);

        print_ll(); // Output: 10 23 24

        delete_node(2);
        print_ll(); // Output: 10 24
    }
}
