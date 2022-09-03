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
    
    public int size( ListNode head ){
        
        int c = 0;
        
        while( head != null ){
            head = head.next;
            c++;
        }
        
        return c;
        
    }
    
    ListNode th = null;
    ListNode tt = null;
    
    public void addFirst( ListNode head ){
        
        if( th == null ){
            th = head;
            tt = head;
            
        }else{
            head.next = th;
            th = head;
            
        }
        
    }
    
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if( head == null || head.next == null || k > size(head) ){
            return head;
        }
        
        ListNode oh = null;
        ListNode ot = null;
        
        while( size(head) >= k ){
            
            for( int i = 0; i<k ; i++ ){
                ListNode frw = head.next;
                head.next = null;
                addFirst(head);
                head = frw;
            }
            
            if( oh == null ){
                oh = th;
                ot = tt;
                
            }else{
                ot.next = th;
                ot = tt;
            }

            th = null;
            tt = null;
        }
       
        if( head != null ){
            ot.next = head;
        }
         
        return oh;
    }
}