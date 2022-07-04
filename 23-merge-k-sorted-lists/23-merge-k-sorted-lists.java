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
    
    public ListNode mergeToList( ListNode l1 , ListNode l2 ){
        
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
        
        if( l1 != null ){
            t.next = l1;
        }else{
            t.next = l2;
        }
        
        return ans.next;
    }
    
    public ListNode helper( ListNode[] lists , int left , int right ){
        
        if( left > right ) return null;
        if( left == right ) return lists[left];
        
        int mid = (left+right) / 2;
        
        ListNode l1 = helper( lists , left , mid );
        ListNode l2 = helper( lists , mid+1 , right );
        
        return mergeToList( l1 , l2 );
        
    }
    
    
    
    
    
    public ListNode mergeKLists (ListNode[] lists) {
        
        if( lists.length == 0 ) return null;
        
        return helper( lists , 0 , lists.length-1 );
        
    }
}