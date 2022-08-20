class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put( 0 , -1 );
        
        int sum = 0;
        int l = 0;
        
        for( int i =0; i<nums.length ; i++ ){
            
            if( nums[i] == 0 ){
                sum += -1;
                
            }else{
                sum += 1;
                
            }
            
            l = Math.max( l , i - hm.getOrDefault(sum , i));
            if( hm.containsKey(sum) == false ){
                hm.put( sum , i );
            }  
            
        }
        
        return l;
        
        
        
    }
}