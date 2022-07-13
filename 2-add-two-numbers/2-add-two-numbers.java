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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode(-1);
        ListNode h = ans;
        ListNode t = ans;
        
        int c = 0;
        while( l1 != null || l2 != null || c != 0 ){
           
            int a1 = ( l1 == null ) ? 0 : l1.val;
            int a2 = ( l2 == null ) ? 0 : l2.val;
            
            ListNode a = new ListNode( (a1+a2+c) % 10 );
            c = (a1+a2+c) / 10 ;
            
            t.next = a;
            t = t.next;
            
            if( l1 != null ) l1 = l1.next;
            if( l2 != null ) l2 = l2.next;
            
        }
        
        return ans.next;

    }
}