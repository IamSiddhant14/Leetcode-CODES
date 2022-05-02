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
    
    long memo( int noOfDigits , int prevDigit , long[][] dp ){
        
        if( noOfDigits == 0 ) return 1;//empty String
        
        if( dp[noOfDigits][prevDigit] != 0 ) return dp[noOfDigits][prevDigit] ;
        
        long appending0 = memo(noOfDigits -1 , 0 , dp );
        long appending1 = ( prevDigit == 0 ) ? memo( noOfDigits-1 , 1 , dp ) : 0l ;
        
        
        return dp[noOfDigits][prevDigit] = (appending0+appending1 )% 1000000007 ; //this to to avoid answers in long
        
    }
    
    
    
    long countStrings(int n) {
        
        // if( n == 0 ) return 1;
        
        long[][] dp = new long[n+1][2];
        return memo(n , 0 , dp);

    }
}