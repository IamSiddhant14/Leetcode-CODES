class Solution {
    public int jump(int[] nums) {
        
        long[] dp = new long[nums.length+1];
        Arrays.fill( dp , -1);
        
        return (int)memorize( 0 , dp , nums);
        
    }
    
    public static long memorize(int n , long[] dp , int[] nums){
        
        if( n == nums.length -1 ) return 0;
        
        if( dp[n] != -1) return dp[n];
        
        long ans = Integer.MAX_VALUE;
        
        for( int i =1; i<=nums[n] ; i++){
            
            if( n+i <= nums.length -1 ){
                ans = Math.min( ans , memorize( n+i , dp , nums )+1);
            }
        }
        
        dp[n] = ans;
        
        return ans;
        
    }
}