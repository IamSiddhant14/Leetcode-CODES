class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int n = nums.length ;
        for( int i=0 ; i<n; i++ ){
            
            int v = nums[i] % ( n+1 );
            if( v != 0 ) nums[v-1] += (n+1) ;
            
        }
        
        int[] ans = new int[2];
                
        for( int i = 0 ; i<n ; i++ ){
            
            if( nums[i] < (n+1) ) ans[1] = i+1 ;
            if( nums[i] / (n+1) >= 2 ) ans[0] = i+1 ;
            
        }
        
       return ans; 
        
    }
}