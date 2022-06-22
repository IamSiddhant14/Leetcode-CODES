class Solution {
    public boolean canJump(int[] nums) {
        
        int curr = 0;
        
        for( int i = 0 ; i<nums.length ; i++ ){
            
            if(curr < i ){
                return false;
            }
            
            int currReach = i+nums[i];
            
            if( curr < currReach ){
                curr = currReach;
            }
            
        }
        
        if( curr >= nums.length -1 ){
            return true;
        }
        
        return false;
    }
}