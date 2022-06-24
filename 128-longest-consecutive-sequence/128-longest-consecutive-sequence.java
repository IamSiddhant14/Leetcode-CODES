class Solution {
    
    int getans( int[] nums ){
        
        HashMap<Integer, Boolean> hm = new HashMap<>();
        
        for( int i = 0; i<nums.length ; i++ ){
            hm.put( nums[i] , true );
        }
        
        for( int i = 0; i<nums.length ; i++ ){
            
            if( hm.containsKey(nums[i]-1) == true ){
                hm.put( nums[i] , false );
            }
        }
        
        int max = 0;
        
        for( int ch : hm.keySet()){
            
            if( hm.get(ch) == true ){
                
                int count = 1;
                
                while( hm.containsKey(ch+count) ){
                    count++;
                }
                
                max = Math.max( max , count);
                
                
            }
            
        }
        
        return max;
        
        
        
    }
    
    public int longestConsecutive(int[] nums) {
        
       return  getans( nums );
        
       // Approch : 1
//         if( nums.length == 0 ) return 0;
//         Arrays.sort( nums );
        
//         int left = 0 , max = 1;
        
//         while( left < nums.length ){
            
//             int right = left+1 , count = 1;
            
//             while( right < nums.length && (nums[right-1] == nums[right] || nums[right-1]+1 == nums[right])){
                
//                 if( nums[right-1] == nums[right]-1 ){
//                     count++;
//                 }
                
//                 right++;
                
//             }
            
//             max = Math.max( max , count);
//             left = right;
            
            
//         }
        
//         return max;
        
    }
    
    
}