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
    public boolean hasCycle(ListNode head) {
        
        if( head == null || head.next == null ){
            return false;
        }
        
        if( head.next == head ){
            return true;
        }
        
        ListNode s = head;
        ListNode f = head;
        
        while( f != null && f.next != null ){
            
            s=s.next;
            f=f.next.next;
            
            if( s == f ){
                return true;
            }
            
        }
        
        return false;
        
    }
}