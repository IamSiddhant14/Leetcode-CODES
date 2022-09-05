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
        
        ListNode ans = new ListNode(-1);
        ListNode t = ans;
        
        ListNode curr = head;
        while( curr != null ){
            
            ListNode frw = curr.next;
            if( frw != null && curr.val == frw.val ){
                
                while( frw != null && curr.val == frw.val ){
                    frw = frw.next;
                }
                
                curr = frw;
                
            }else{
                
                t.next = curr;
                t = curr;
                curr = frw;
            }
            
        }
        
        t.next = null;
        return ans.next;
        
    }
}