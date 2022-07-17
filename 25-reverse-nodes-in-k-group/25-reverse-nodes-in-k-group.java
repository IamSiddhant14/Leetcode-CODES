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
    
    public int length(ListNode head){
        
        ListNode curr = head;
        int l = 0;
        
        while( curr != null ){
            curr = curr.next;
            l++;
        }
        
        return l;
    }
    
    public ListNode th = null;
    public ListNode tt = null;
    
    public void addFirst(ListNode node){
        
        if( th == null ){
            th = node;
            tt = node;
        }else{
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode oh = null ;
        ListNode ot = null;
        
        int len = length(head);
        ListNode curr = head;
        
        while( len >= k){
            
            for( int i = 0; i<k ; i++ ){
                
                ListNode frw = curr.next;
                curr.next = null;
                
                addFirst(curr);
                curr = frw;
            }
            
            if( oh == null ){
                oh = th ;
                ot = tt ;
            }else{
                ot.next = th;
            }
            
            ot = tt;
            ot.next = null;
            
            th = null;
            tt = null;
            
            len -= k;
            
        }
        
        if(len > 0 ){
            ot.next = curr;
        }
        
        return oh;
        
        
    }
}