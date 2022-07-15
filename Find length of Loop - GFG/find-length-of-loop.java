// { Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}
// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        
        if( head == null ){
            return 0;
        }
        
        if( head.next == null ){
            return 0;
        }
        
        if( head.next == head){
            return 1;
        }
        
        // System.out.println("here1");
        Node s = head;
        Node f = head;
        // System.out.println("here2");
        
        while( f != null && f.next != null ){
    
            s=s.next;
            f=f.next.next;
            
            if( s == f ){
                break;
            }
        }
        
        if(  f == null || f.next == null ) return 0;
    
        Node q = s.next;
        int dis = 1;
        
        while(q != s ){
            dis++;
            q = q.next;
        }
        

        return dis;
    }
}