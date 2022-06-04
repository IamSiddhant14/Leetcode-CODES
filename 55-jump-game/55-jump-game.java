class Solution {
    public boolean canJump(int[] nums) {
        
        int currMax = 0;
        
        for( int i = 0; i <= nums.length-1 ; i++){
            
            if( currMax < i ){
               return false;
            }
            
            currMax = Math.max( currMax , i+nums[i]); 
            
        }
        
        if( currMax >= nums.length-1 ){
            return true;
        }
        
        return false;
        
    }
}