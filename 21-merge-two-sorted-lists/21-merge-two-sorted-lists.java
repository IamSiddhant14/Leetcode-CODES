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
        
        ListNode h = ans;
        ListNode t = ans;
        
        while( list1 != null && list2 != null ){
            
            if( list1.val <= list2.val ){

                t.next = list1;
                list1 = list1.next;
                
            }else{

                t.next = list2;
                list2 = list2.next;
                
            }
            
            t = t.next;
            
        }
        
        if( list1 != null ){
            t.next = list1;
        }
        
        if( list2 != null ){
            t.next = list2;
        }
        
        return ans.next;
    }
}