class Solution {
    public int coinChange(int[] coins, int amount) {
        
   //Since here the amount is variable hence in the dp table we will create of length amount.length where each      index stores the minium changes to reduce it to 0;
        
        int[] dp = new int[amount+1];
        Arrays.fill( dp , -1 );
        
        int a = ans( coins , amount , dp );
        
        return ( a == Integer.MAX_VALUE ) ? -1 : a;
        
    }
    
    public int ans( int[] coins , int amount , int[] dp ){
        
        if( amount == 0 ) return 0;
        
        if( dp[amount] != -1 ) return dp[amount];
        
        int min = Integer.MAX_VALUE;
        for( int i = 0; i<coins.length ; i++ ){

            if( amount - coins[i] >= 0 ){
                min = Math.min(  min , ans(coins , amount - coins[i] , dp ) );
            }
            
        }
        
        if( min < Integer.MAX_VALUE ) min += 1;
        return dp[amount] = min;
        
    }
}