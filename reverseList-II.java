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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right){ return head; }

        ListNode dummyNode = new ListNode(0);

        dummyNode.next = head;
        ListNode prev = dummyNode ;

        int i = 1;
        while(i < left){
            prev = prev.next;
            i++;
        }
        
        int j = 0;
        ListNode curr = prev.next;
        while(j < right - left){
        
            ListNode temp = curr.next;     // node to be moved
            curr.next = temp.next;         // unlink temp
            temp.next = prev.next;         // insert temp after prev
            prev.next = temp;  
              
            j++;
        }

        return dummyNode.next;
    }
}