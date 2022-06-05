class Solution {
    
    
    public int numDecodings(String s) {
        
        int[] dp = new int[s.length() + 1 ];// For the corresponding length(index) it will be storing the respective no of encodings possible for a string of that given length
        
        Arrays.fill( dp , -1 );
        return ans( s , 0 , dp );
        
    }
    
    public int ans( String s , int idx , int[] dp ){
        
        if( idx == s.length() )return 1; // As a empty could be encoded in one way
        
        if( dp[idx] != -1 ) return dp[idx];
        
        int ans1 = 0 , ans2 = 0;
        
        if( s.charAt(idx) != '0'){
            ans1 = ans( s , idx+1 , dp );
        }
        
        if( idx+1 < s.length() && s.charAt(idx) != '0' ){
            int digit = ( (s.charAt(idx) - '0')* 10  + ( s.charAt(idx+1) - '0') );
            
            if( digit >= 10 && digit <= 26  ){
                ans2 = ans( s , idx+2 , dp );
            }
        }
        
        return dp[idx] = ans1+ans2;
        
    }
    
    
    
}