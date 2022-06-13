// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(N));
        }
    }
}// } Driver Code Ends


class Solution {
    
    static Long numberOfWays(int N) {
        
        long[] dp = new long[N+1];
        
        Arrays.fill(dp , -1);
        
        return ans( N , dp );
        
    }
    
    static int mod = (int)(1e9 + 7);
    
    static long ans( int n , long[] dp ){
        if( n <= 2 ){
            return n;
        }
        
        if( dp[n] != -1 ) return dp[n];
        
        long a1 = (n-1 >= 0 ) ? ans( n-1 , dp) : 0;
        long a2 = (n-2 >= 0 ) ? ans( n-2 , dp) : 0;
        
        dp[n] = (a1 + a2 ) %(int)(1e9 + 7) ;
        
        return dp[n] ;
        
    }
};