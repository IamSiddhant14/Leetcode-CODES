class Solution {
    
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        
        for( int i=0 ; i<= nums.length-1 ; i++ ){
            
            if( reach < i ) return false;
           
            if( reach < i+nums[i]){
               reach = i+nums[i];
            }
        }
        
        return true;
        
    }
}