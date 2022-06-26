class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap < Integer , Boolean > hm = new HashMap <>();
        
        for( int i = 0; i<nums.length ; i++ ){
            hm.put( nums[i] , true);
        }
        
        for( Integer a : hm.keySet() ){
            
            if( hm.containsKey(a-1) ){
                hm.put( a , false );
            }
        }
        
        int max = 0;
        for( Integer a : hm.keySet() ){
            
            if( hm.get(a) == true ){
                
                int count = 1;
                
                while( hm.containsKey(++a) ){
                    count++;
                }
                
                max = Math.max( max , count );
            }
        }
        
        return max;
        
        
    }
}