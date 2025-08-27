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

// leetcode : https://leetcode.com/problems/palindrome-linked-list/
// TC : O(n) , SC : O(1);

class Solution {
    public boolean isPalindrome(ListNode head) {

        // Code to find mid 
        if(head.next == null || head == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow; // mid of LL

        // Code to reverse LL 
        ListNode prev = null;
        ListNode curr = mid;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode reversedLL = prev;
        ListNode givenLL = head;


        // Step to check both LL values is sam or not //
        while(reversedLL != null){
            if(givenLL.val != reversedLL.val){
                return false ;
            }
            givenLL = givenLL.next;
            reversedLL = reversedLL.next;
        }
        return true;
    }
}