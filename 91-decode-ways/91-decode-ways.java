class Solution {
    public int numDecodings(String s) {
        
        int[] dp = new int[s.length() +1]; // For the given index/length of string the number of encoding possible are strored respectively
        Arrays.fill( dp , -1 );
        
        return ans( s , 0, dp );
        
    }
    
    public int ans( String s, int idx , int[] dp ){
        
        if( idx == s.length() ){
            return 1; // For an empty string number of encoding possible is zero
        }
        
        if( dp[idx] != -1 ) return dp[idx];
        
        char a1 = s.charAt(idx);
        int ans1 = 0 , ans2 = 0;
        
        if( a1 != '0' ){
            ans1 = ans( s , idx+1 , dp );
        }
        
        if( idx+1 < s.length() && s.charAt(idx) != '0' ){
            
            int val = ((s.charAt(idx) - '0') * 10) + (s.charAt(idx+1) - '0') ;
        
            if( val >= 10 && val <= 26 ){
             ans2 = ans( s , idx+2 , dp );
            }
        
          }
        
        dp[idx] = ans1 + ans2;
        return dp[idx];

    }
    
    
}