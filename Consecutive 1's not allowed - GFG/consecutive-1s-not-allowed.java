// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    
    long countStrings(int n) {
        
        long [][] dp = new long [n+1][2];
        return help( n, 0 , dp );
        
    }
    
    long help( int n , int prev ,long [][] dp ){
        
        if( n == 0 ) return 1l ;
        
        if( dp[n][prev] != 0 ) return dp[n][prev] ;
        
        long append0 =  help( n-1 , 0 , dp) ;
        long append1 =  (prev != 1 ) ? help( n-1 , 1 , dp ) : 0 ;
        
        return dp[n][prev] = (append0 + append1) % 1000000007 ;

    }
}

