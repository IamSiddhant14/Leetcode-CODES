class Solution {
    public int jump(int[] nums) {
        
        int[] dp = new int[nums.length+1];
        Arrays.fill( dp , -1);
        
        int res = getAns( 0 , nums , dp);
        // for(int i:dp)
        //     System.out.print(i+" ");
        return res;
    }
//     [2,3,0,1,4]
    // (0)
    // (1)
    // (2)
    
    public int getAns( int n , int[] nums , int[] dp ){
        
        if( n == nums.length -1 ){
            return 0;
        }
        
        if( dp[n] != -1 ) return dp[n];
        
        long ans = Integer.MAX_VALUE;
        
        for( int i = 1; i<=nums[n] ; i++ ){
            
            if( n+i <= nums.length -1 ){ 
                int a1 = getAns( n+i , nums , dp);
                ans = (int)(Math.min(a1 , ans ));
            }
            
        }
        
        dp[n] = ans == Integer.MAX_VALUE? (int)ans: (int)ans+1;
        // System.out.print(dp[n]+".."+n+" ");
        return (ans == Integer.MAX_VALUE? (int)ans: (int)ans+1);
        
        
    }
}