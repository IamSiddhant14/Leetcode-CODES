// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        
        Node z = new Node(-1);
        Node zt = z;
        
        Node o = new Node(-1);
        Node ot = o;
        
        Node tw = new Node(-1);
        Node twt = tw;
        
        while( head != null ){
            
            int v = head.data;
            
            if( v == 0 ){
            
               zt.next=head;
               zt=zt.next;
               
            }else if( v == 1 ){
                
               ot.next=head;
               ot=ot.next;
                
            }else{
                
               twt.next=head;
               twt=twt.next;
                 
            }
            
            head = head.next;
            
        }
        
        twt.next = null;
        ot.next = tw.next;
        zt.next = o.next;
        
        
        
        return z.next;
        
        
    }
}


