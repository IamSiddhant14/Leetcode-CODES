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
}