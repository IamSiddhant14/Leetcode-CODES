class Solution {
    public int jump(int[] nums) {
        
        long[] dp = new long[nums.length];
        Arrays.fill( dp , -1 );
        
        return (int) ans( nums, 0 , dp );
        
    }
    
    public long ans( int[] nums , int idx , long[] dp ){
        
        if( idx >= nums.length-1 ) return 0;
        
        // if( idx > nums.length-1 ) return Integer.MAX_VALUE;
        
        if( dp[idx] != -1 ) return dp[idx];
        
        long a = Integer.MAX_VALUE;
        
        for( int i = 1; i<= nums[idx] ; i++ ){
            
            if( i+idx <= nums.length -1 ){
                a = Math.min( a , ans( nums , idx+i ,dp )+ 1l ) ;
            }
            
        }
    
        dp[idx] = a;
        return dp[idx];
    
    }
}