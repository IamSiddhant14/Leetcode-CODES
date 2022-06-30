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
        
        long[][] dp = new long[n+1][2];
        for( int i = 0; i < dp.length ; i++){
            dp[i][0] = -1 ;
            dp[i][1] = -1 ;
        }
        
        return findAns(n , dp , 0 );
    }
    
    long findAns( int n , long[][] dp , int prev ){
        
        if( n == 0 ){
            return 1;
        }
        
        if( dp[n][prev] != -1 ) return dp[n][prev];
        
        long append0 = findAns( n-1 , dp , 0);
        long append1 = ( prev == 0 ) ? findAns( n-1 , dp , 1 ) : 0;
        
        return dp[n][prev] = (append0 + append1) % 1000000007;
        
    }
    
    
}