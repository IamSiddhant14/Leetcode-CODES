class Solution {
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        
        for( int i = 0; i<nums.length ; i++ ){
            
            if( reach < i ){
                return false;
            }
            
            int currReach = i+nums[i];
            
            if( currReach > reach ){
                reach = currReach ;
            }
            
        }
        
        if( reach >= nums.length-1 ){
            return true;
        }
        
        return false;
        
    }
}