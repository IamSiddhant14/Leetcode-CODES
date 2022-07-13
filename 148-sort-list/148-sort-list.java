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
    
    public ListNode midNode(ListNode head){
        
        ListNode s = head;
        ListNode f = head;
        ListNode prev = null;
        
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
    
    
    public ListNode merge( ListNode l1 , ListNode l2 ){
        
        ListNode ans = new ListNode(-1);
        ListNode h = ans;
        ListNode t = ans;
        
        while( l1 != null && l2 != null ){
            
            if( l1.val <= l2.val ){
                t.next = l1;
                l1 = l1.next;
            }else{
                t.next = l2;
                l2 = l2.next;
            }
            
            t = t.next;  
            
        }
        
        if( l1 != null){
            t.next= l1;
        }
        
        if( l2 != null ){
            t.next = l2;
        }
        
        return ans.next;
        
    }
    
    public ListNode sortList(ListNode head) {
        
        if( head == null || head.next == null){
           return head;
        }
        
        ListNode mid = midNode(head);
        ListNode midNext = mid.next;
        mid.next = null;
        
        ListNode a1 = sortList(head);
        ListNode a2 = sortList(midNext);
        
        return merge( a1 , a2 );
    }
    
    
}