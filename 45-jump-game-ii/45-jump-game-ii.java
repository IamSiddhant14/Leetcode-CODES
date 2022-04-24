class Solution {
    public int jump(int[] nums) {
        
        int[] dp = new int[nums.length+1];
        Arrays.fill( dp , -1);
        
        return getAns( 0 , nums , dp);
        
    }
    
    public int getAns( int n , int[] nums , int[] dp ){
        
        if( n == nums.length -1 ){
            return 0;
        }
        
        if( dp[n] != -1 ) return dp[n];
        
        int ans = 9999;
        
        for( int i = 1; i<=nums[n] ; i++ ){
            
            if( n+i <= nums.length -1 ){ 
                int a1 = getAns( n+i , nums , dp);
                ans = (int)(Math.min(a1 , ans ));
            }
            
        }
        
        dp[n] = ans+1;
        
        return ans+1;
        
        
    }
}