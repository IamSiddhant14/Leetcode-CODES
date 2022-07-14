/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int getSize(ListNode head){
        
        ListNode curr = head;
        int count = 0;
        
        while( curr != null){
            count++;
            curr= curr.next;
        }
        
        return count;
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int v1 = getSize(headA);
        int v2 = getSize(headB);
        
        
        if( v1 > v2 ){
            
            int diff = v1-v2;
            
            for( int i = 0; i<diff ; i++ ){
                headA = headA.next;
            }
            
        }else{
            
            int diff = v2-v1;
            
            for( int i = 0; i<diff ; i++ ){
                headB = headB.next;
            }  
        }
        
        
        while( headA != headB ){
            headA = headA.next;
            headB = headB.next;
        }
        
        return  headA;
        
    }
}