// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minSteps(n));
                    
                }
        }
}    // } Driver Code Ends


class Solution{

	public int minSteps(int N) 
	{ 
	    int[] dp = new int[N+1];
	    Arrays.fill( dp , -1);
	    
	    return help( N , dp );
	    
	} 
	
	public int help( int n , int[] dp ){
	    
	    if( n == 1 ) return 0;
	    
	    if( dp[n] != -1 ) return dp[n];
	    
	    int a1 = ( n % 2 == 0 ) ? help( n/2 , dp ) : Integer.MAX_VALUE;
	    int a2 = ( n % 3 == 0 ) ? help( n/3 , dp ) : Integer.MAX_VALUE;
	    int a3 = ( n - 1 >= 1 ) ? help( n-1 , dp ) : Integer.MAX_VALUE;
	    
	    return dp[n] = Math.min( a1 ,Math.min(a2 , a3))+1;
	  
	}
	
	
}
