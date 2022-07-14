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

        if( head == null || head.next == null ){
            return head;
        }

        ListNode ans = new ListNode(9876);
        ListNode t = ans;
        
        while( head != null ){
            
            ListNode curr = head.next;
            
            if( curr != null && curr.val == head.val ){
                
                while(curr != null && curr.val == head.val ){
                    curr = curr.next;
                }
                
                head = curr;
                
            }else{
                t.next = head;
                t=t.next;
                head = curr;
            }
            
        }
        
        t.next = null;
        return ans.next;
        
    }
}