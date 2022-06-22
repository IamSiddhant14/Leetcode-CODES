class Solution {
    public int jump(int[] nums) {
        
        long[] dp = new long[nums.length+1];
        Arrays.fill( dp , -1 );
        
        return (int)ans( nums , dp , 0);
        
    }
    
    long ans( int[] nums , long[] dp , int idx ){

        if( idx == nums.length-1  ){
            return 0;
        }
        
        if( dp[idx] != -1 ) return dp[idx];
        
        long a = Integer.MAX_VALUE;
        for( int i = 1; i <= nums[idx] ; i++ ){
            
            if( idx+i <= nums.length-1 ){
                a = Math.min( a , ans(nums , dp , idx+i ) );
            }
            
        }
        
        dp[idx] = a+1l;
        // if( a == Integer.MAX_VALUE ){
        //     return a;
        // }
        
        return dp[idx];
    }
    
    
}