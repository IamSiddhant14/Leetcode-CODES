class Solution {
    public int jump(int[] nums) {
        
        long[] dp = new long[nums.length+1];
        Arrays.fill( dp , -1);
        
        return (int)help( 0 , nums , dp );
        
    }
    
    public long help( int idx , int[] nums , long[] dp ){
        
        if( idx >= nums.length ) return Integer.MAX_VALUE;
        
        if( idx == nums.length - 1) return 0;
        
        if( dp[idx] != -1 ) return dp[idx];
        
       long ans = Integer.MAX_VALUE;

        for( int i=1; i<= nums[idx]; i++){
            
            if( idx+i <= nums.length - 1 ){
                ans = Math.min( ans , help(idx+i , nums , dp)+1l);
            }
        }
        
        return dp[idx] = ans;
 
    }
}