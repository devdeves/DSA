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
    public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null){ return head;}
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode curr = dummy ;

            while(curr.next != null && curr.next.next != null){
                ListNode temp = curr.next ;
                curr.next = curr.next.next ; // swap first with last ++ 2 nodes 
                temp.next = curr.next.next ; // need to link next of second to first swapped node..
                curr.next.next = temp ;     // swap ++2 node  seond's place node to first ...

                curr =  temp ;
            }

            return dummy.next;
    }
}