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
    
    static int MOD = (int)(1e9+7);

    
    static long memo( int n , long[] dp) {
        
        if( n <= 2 ){
            return n;
        }
        
        if( dp[n] != -1 ) return dp[n];
        
        long a1 = memo( n-1 , dp );
        long a2 = memo( n-2 , dp );
        
        return dp[n] = (a1+a2 ) % MOD;
        
        
        
    }
    
    
    static Long numberOfWays(int N) {
        
        long[] dp = new long[N+1];
        Arrays.fill(dp , -1);
        
        return memo( N , dp);
    }
};