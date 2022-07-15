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
    
    public ListNode findMid(ListNode head ){
        
        ListNode s = head;
        ListNode f = head;
        
        ListNode prev = null;
        
        while( f != null && f.next != null ){
            
            prev = s;
            s=s.next;
            f=f.next.next;
            
        }
        
        if( f == null ){
            return prev;
        }
        
        return s;
    }
    
    public ListNode reverse(ListNode head){
        
        ListNode prev = null;
        ListNode curr = head;
        
        while( curr != null ){
            
            ListNode frw = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = frw;
    
        }
        
        return prev;
        
    }
    
    public void reorderList(ListNode head) {
        
        ListNode mid = findMid(head);        
        ListNode midNext = mid.next;
        mid.next = null;
        
        ListNode a1 = head;
        ListNode a2 = midNext;
        
        ListNode rev = reverse(a2);
        ListNode ans = new ListNode(3457938);
        
        ListNode t = ans;
        
        while( a1 != null || rev != null ){
            
            if( a1 != null ){
               t.next = a1;
               a1=a1.next;
               t=t.next;             
            }

            if( rev != null ){
              t.next = rev;
              rev=rev.next;
              t=t.next;
            }

        }
        
        if( a1 != null ){
            t.next = a1;
        }
        
        if( a2 != null ){
            t.next = a2;
        }
        
        t.next = null;
        head = ans.next;

    }
}