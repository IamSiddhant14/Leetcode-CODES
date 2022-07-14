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
    public ListNode partition(ListNode head, int x) {
        
        ListNode lhead = new ListNode(-1);
        ListNode ltail = lhead;
        
        ListNode rhead = new ListNode(-1);
        ListNode rtail = rhead;
        

        
        while( head != null ){
            
            int v = head.val;
            
            if( v < x ){
                ltail.next = head;
                ltail = ltail.next;
            }else{
                rtail.next = head;
                rtail = rtail.next;
            }
            
            head = head.next;
        }
        
        rtail.next = null;
        ltail.next= rhead.next;
        
        return lhead.next;
        
    }
}