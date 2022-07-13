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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if( head == null || head.next == null ){
            return null;
        }
        
        if( head.next == head){
            return head;
        }
        
        ListNode s = head;
        ListNode f = head;
        ListNode curr = head;
        
        while( f != null && f.next != null ){
            
            s=s.next;
            f=f.next.next;
            
            if( s == f ){
                
                while( s.val != curr.val ){
                    s=s.next;
                    curr= curr.next;
                }
                
                return s;
            }
        }
        
        return null;
        
    }
}