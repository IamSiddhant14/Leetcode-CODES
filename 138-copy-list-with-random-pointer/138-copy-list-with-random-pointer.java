/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    public Node copyRandomList(Node head) {
        
        HashMap < Node , Node > hm = new HashMap<>();
        Node org = head;
        
        Node dup = new Node(-1);
        Node t = dup ;
        
        while( org != null ){
            Node temp = new Node(org.val);
            t.next = temp;
            
            t = t.next;
            hm.put( org , temp );
            org = org.next;
            
        }
        
        Node curr = head;
        while( curr != null ){
            
            Node randomNode = curr.random;
            
            if( randomNode != null ){
                randomNode = hm.get(randomNode);
            }
            
            hm.get(curr).random = randomNode;
            curr = curr.next;

        }
        
        return dup.next;
        
    }
    
}