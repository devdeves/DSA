/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Optmized solution with TC : O(n) , SC : O(1);
// leetcode : https://leetcode.com/problems/linked-list-cycle/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow , fast , curr ;
        if(head == null || head.next == null || head.next.next == null){return false;}
        curr = head;
        slow = head.next;
        fast = head.next.next;

        while(fast != null && fast.next != null && slow != null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}