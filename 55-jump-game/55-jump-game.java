class Solution {
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        for( int i =0; i<nums.length ; i++ ){
            
            if( i > reach ) return false;
            
            if( reach <= i+nums[i]){
               reach = i+nums[i];
            }
        }
        return true;
    }
}