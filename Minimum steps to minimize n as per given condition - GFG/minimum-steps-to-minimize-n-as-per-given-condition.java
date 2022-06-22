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
	    if( N == 1 ){
	        return 0;
	    }
	    int[] dp = new int[N+1];
	    Arrays.fill( dp , -1 );
	    
	    ans( N , dp );
	    return dp[N];
	} 
	
	int ans( int n , int[] dp ){
	    
	    if( n == 1 ){
	        return 0;
	    }
	    
	    if( dp[n] != -1 ) return dp[n];
	    
	    int a1 = ( n % 2 == 0 ) ? ans( n/2 , dp  ) :Integer.MAX_VALUE ;  
	    int a2 = ( n % 3 == 0 ) ? ans( n/3 , dp  ) :Integer.MAX_VALUE ;
	    int a3 =  ans(n-1 , dp  ) ; 
	    
	    return dp[n] = Math.min( a1 , Math.min( a2 , a3 ))+1;
	    
	}
}
