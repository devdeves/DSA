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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
  ListNode sentinal = new ListNode(0);
        sentinal.next = head ;
        ListNode curr = sentinal.next;
        int length = 0;

        while(curr != null){
            length++;
            curr = curr.next;
        }

        ListNode currN = sentinal;
        int counter = 0;

        while(counter < length - n){
            currN = currN.next;
            counter++;
        }
        currN.next = currN.next.next;

        return sentinal.next;

    }
}