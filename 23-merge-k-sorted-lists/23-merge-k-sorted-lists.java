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
    
    public ListNode mergeSort( ListNode a1 , ListNode a2 ){
        
        ListNode ans = new ListNode(-1);
        ListNode t = ans;
        
        while( a1 != null && a2 != null ){
            
            int v1 = a1.val ;
            int v2 = a2.val ;
            
            if( v1 < v2 ){
                t.next = a1;
                a1 = a1.next;
                t = t.next;
                
            }else{
                t.next = a2;
                a2 = a2.next;
                t = t.next;
                
            }
            
        }
        
        if( a1 != null ){
            t.next = a1;
            t = t.next;
        }
        
        if( a2 != null ){
            t.next = a2;
            t = t.next;
        }
        
        return ans.next;
    }
    
    
    public ListNode mergeHelper( int start , int end , ListNode[] lists ){
        
        if( start == end ){
            return lists[end];
        }
        
        int mid = ((start + end )/ 2) ;
        
        ListNode a1 = mergeHelper( start , mid , lists );
        ListNode a2 = mergeHelper( mid+1 , end , lists );
        
        return mergeSort( a1 , a2 );
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if( lists.length == 0 ) return null ;
        return mergeHelper( 0 , lists.length -1 , lists);
    }
}