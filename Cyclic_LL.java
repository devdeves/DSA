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
// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/description/

// This solution is for T.C : O(n) and SC : O(n) //

public class Solution {
    public boolean hasCycle(ListNode head) {
     Set<ListNode> seen = new HashSet<>();

     ListNode curr = head;
     while(curr != null){
        if(seen.contains(curr)){
            return true;
        }
        seen.add(curr);
        curr = curr.next;
     }
     return false;
    }
}