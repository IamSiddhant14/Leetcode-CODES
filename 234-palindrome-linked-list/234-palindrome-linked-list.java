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
    
    public boolean isPalindrome(ListNode head) {
        
        if( head == null || head.next == null ){
            return true;
        } 
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while( fast != null && fast.next != null ){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if( fast == null ){
            slow = prev;
        }
        
        ListNode rev = reverse(slow.next);
        
        while( head != null && rev != null ){
                
            if( head.val != rev.val ){
                return false;
            }
            
            head = head.next;
            rev = rev.next;
        }
        
        // if( head != null || rev != null ){
        //     return false;
        // }
        
        return true;
        
        
        
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
}

