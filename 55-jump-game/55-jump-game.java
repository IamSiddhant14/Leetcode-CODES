class Solution {
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        for( int i =0; i<= nums.length-1 ; i++ ){
            
            if( i > reach ){
               return false;
            }
            
            if( i+nums[i] > reach ){
               reach = i+nums[i];
            }            
            
        }
        
        return true;
    }
}