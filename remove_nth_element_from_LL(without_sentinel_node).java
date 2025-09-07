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
         // Step 1: find length
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Step 2: if we remove the head
        if (n == length) {
            return head.next;
        }

        // Step 3: find node before the one to delete
        ListNode currN = head;
        for (int i = 1; i < length - n; i++) { // go to predecessor
            currN = currN.next;
        }

        // Step 4: delete node
        currN.next = currN.next.next;

        return head;

    }
}