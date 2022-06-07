class Solution {
    public boolean canJump(int[] nums) {
        
        int currR = 0;
        
        for( int i = 0; i<nums.length ; i++ ){ 
            
            if( currR < i ) return false ;
            
            int reach = i + nums[i];
            
            if( reach > currR ){
               currR = i + nums[i];
            }
                
        }
        
        if( currR < nums.length-1)
            return false;
        
        return true;
    }
}