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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odd = new ListNode(-1);
        ListNode ot = odd;
        
        ListNode even = new ListNode(-1);
        ListNode oe = even;
        
        while( head != null ){
            
            ot.next = head;
            ot = ot.next;
            head = head.next;
            
            if( head != null ){
                oe.next = head;
                oe=oe.next;
                head=head.next;
            }
        }
        
        oe.next = null;
        ot.next = null;
        
        if( odd == null ){
            return even.next;
        }else if( even == null ){
            return odd.next;
        }else{
            ot.next = even.next;
        }
        
        return odd.next;
        
    }
}