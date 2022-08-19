class Solution {
    public int majorityElement(int[] nums) {
        
        int major = Integer.MIN_VALUE ;
        int freq = 0 ;
        
        for( int ele : nums ){
            
            if( ele == major ){
                freq++;
                
            }else{
                freq--;
                
                if( freq <= 0 ){
                    major = ele;
                    freq = 1;
                }
            }
        }
        
        return major;
    }
}