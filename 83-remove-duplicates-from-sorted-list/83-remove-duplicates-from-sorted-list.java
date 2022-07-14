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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode ans = new ListNode(-32252525);
        ListNode t = ans;

        while( head != null ){
            
           if( t.val != head.val ){
               t.next = head;
               t=t.next;
           }
            
         head = head.next;
            
        }
        
        t.next = null;
        
        return ans.next;
        
    }
}