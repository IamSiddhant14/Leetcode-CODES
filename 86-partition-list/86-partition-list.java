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
        
        ListNode l = new ListNode(-1);
        ListNode lh = l;
        ListNode lt = l;
        
        ListNode r = new ListNode(-1);
        ListNode rt = r;
        ListNode rh = r;
        
        while( head != null ){
            
            int v = head.val;
            
            if( v < x ){
                
                lt.next = head;
                lt = lt.next;
                
            }else{
                
                rt.next = head;
                rt = rt.next;
                
            }
            
            head = head.next;
        }
        
        lt.next = rh.next;
        rt.next = null;
        
        return lh.next;
        
    }
}