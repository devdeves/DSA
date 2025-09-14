/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

            // handle the scenario when head and head.next and k = 0;
            if(head == null || head.next == null || k==0){
                return head ;
            }

            // here we are alredy at head so.. we considering that node too. thatswhy initilising with length 1..
            int length = 1 ; ListNode tail = head;

            // calculating length
            while(tail.next != null){
                tail = tail.next;
                length++;
            }

            // handle the scenario when k value is larger than length of LL ...
            k = k % length ;
            if(k == 0){ // if roatation value is same as length of LL ..
                return head;
            }

            int rotationIndex = length - k - 1; 
            ListNode newNode = head ;
            int i = 0 ;
            while(i < rotationIndex){
                newNode = newNode.next ; 
                i++;
            }

            ListNode newHead =  newNode.next ;
            tail.next = head ;
            newNode.next = null ;

            return newHead;
            

    }
}