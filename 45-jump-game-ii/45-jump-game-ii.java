class Solution {
    public int jump(int[] nums) {
        
        long[] dp = new long[nums.length+1];
        Arrays.fill( dp , -1 );
        
        return (int)findAns( dp , nums , 0 );
        
    }
    
    static long findAns( long[] dp , int[] nums , int idx ){
        
        if( idx == nums.length-1 ){
            return 0;
        }
        
        long minL = Integer.MAX_VALUE;
        
        if( dp[idx] != -1 ) return dp[idx];
        
        for( int i = 1; i <= nums[idx] ; i++ ){
            if( i+idx < nums.length ){
                minL = Math.min( minL , findAns( dp , nums , idx+i ));
            }
        }
        
        dp[idx] = minL;
            
        if( minL < Integer.MAX_VALUE ){
           dp[idx] = minL+1 ;
        }
        
        return dp[idx];

        
    }
}