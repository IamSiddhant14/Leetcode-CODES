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
    
    public ListNode mid(ListNode head){
        
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode prev = null;
        
        while( fast != null  && fast.next != null ){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if( fast == null ){
            return prev;
        }
        
        return slow;
    }
    
    public ListNode rev(ListNode node){
        
        ListNode prev = null;
        ListNode curr = node;
        
        while( curr != null ){
            
            ListNode frw = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = frw;
            
        }
        
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        
        ListNode m = mid(head);
        ListNode midNext = m.next;
        m.next = null;
        
        ListNode a1 = head;
        ListNode a2 = rev(midNext);
        
        while( a1 != null && a2 != null ){
            
            if( a1.val != a2.val ){
                return false;
            }
            
            a1 = a1.next;
            a2 = a2.next;
        }
        
        return true;
        
        
        
    }
}