/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// leetcode : https://leetcode.com/problems/intersection-of-two-linked-lists/

// TC : O(n) , SC : O(n)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set <ListNode> seen = new HashSet<>();
        ListNode curr = headA;
        while(curr != null){
            if(!seen.contains(curr)) seen.add(curr); 
            curr = curr.next;
        }
        ListNode currN = headB;

        while(currN != null){
            if(seen.contains(currN)) return currN;
            currN = currN.next;
        }

        return null;

    }
}