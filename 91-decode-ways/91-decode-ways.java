class Solution {
    public int numDecodings(String s) {
        
        int[] dp = new int[s.length()+1];
        Arrays.fill( dp , -1 );
        
        return ans( 0 , s , dp );
    }
    
    public int ans ( int idx , String s , int[] dp ){
        
        if( idx == s.length() ) return 1;// As a empty could be encoded in one way
        
        if( dp[idx] != -1 ) return dp[idx];
        
        int ans1 = 0 , ans2 = 0;
        
        if( s.charAt(idx) != '0' ){
            ans1 = ans( idx+1 , s , dp );
        }
        
        if( idx + 1 < s.length() &&  s.charAt(idx) != '0' ){
            int a = (s.charAt(idx) - '0') *10 + (s.charAt(idx+1) - '0');
            if( a >= 10 && a <= 26 ){
                ans2 = ans( idx+2 , s , dp );
            }
        }
         
        dp[idx] = ans1 + ans2 ;
        
        return dp[idx];

    }
}