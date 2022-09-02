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
    
    public ListNode Mid( ListNode a ){
        
        ListNode prev = null;
        ListNode s = a;
        ListNode f = a;
        
        while( f != null && f.next != null ){
            
            prev = s;
            s = s.next;
            f = f.next.next;
            
        }
        
        if( f == null ){
            return prev;
        }
        
        return s;
        
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ans = new ListNode(-1);
        ListNode t = ans ;
        ListNode h = ans ;
        
        while( list1 != null && list2 != null ){
            
            int v1 = list1.val ;
            int v2 = list2.val ;
            
            if( v1 < v2 ){
                t.next = list1;
                list1 = list1.next;
                
            }else{
                t.next = list2;
                list2 = list2.next;
                
            }
            
            t = t.next;
        }
        
        if( list1 != null){
            t.next = list1;
        }
        
        if( list2 != null ){
            t.next = list2;
        }
        
        return h.next;
    }
    
    public ListNode sortList(ListNode head) {
        
        if( head == null || head.next == null ){
            return head;
        }
        
        ListNode m = Mid( head );
        ListNode a1 = head;
        
        ListNode a2 = m.next;
        m.next = null;
        
        ListNode q1 = sortList(a1);
        ListNode q2 = sortList(a2);
        
        return mergeTwoLists( q1 , q2 );
        
    }
}