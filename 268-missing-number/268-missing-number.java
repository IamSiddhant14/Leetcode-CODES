class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        for( int i =0; i<n ; i++ ){
            
            int v = nums[i] % (n+1) ;
            if( v < n ) nums[v] += (n+1);
        }
        
        for( int i =0; i<n ; i++ ){
            if( nums[i] < n+1 ) return i;
        }
        
        return n;
    }
}