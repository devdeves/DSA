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
      ListNode dummyNode = new ListNode(0);
      dummyNode.next = head;
      ListNode firstNode = dummyNode;
      ListNode  secondNode = dummyNode ;

      for(int i=0 ; i< n ; i++){
        firstNode = firstNode.next;
      }

      while(firstNode.next != null){
        firstNode = firstNode.next;
        secondNode = secondNode.next;
      }
      secondNode.next =  secondNode.next.next;

      return dummyNode.next ;
    }
}