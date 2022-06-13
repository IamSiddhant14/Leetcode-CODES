class Solution {
    
    public boolean canJump(int[] nums) {

        int reach = 0;
        
        for( int i = 0; i<nums.length ; i++ ){
            
            int currReach = i+nums[i];
            
            if( reach < i){
                return false;
            }
            
            if( reach < currReach ){
                reach = currReach ;
            }
        }
        
        if( reach >= nums.length -1 ){
             return true;
        }
        
        return false;
        
    }
}