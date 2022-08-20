class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap <Integer, Integer> hm = new HashMap<>();
        hm.put( 0 , 1 );
        
        int sum = 0;
        int count = 0;
        
        for( int ele : nums ){
            
            sum = sum + ele ;
            int v = ( sum % k + k ) % k ;
            
            count  = count +  hm.getOrDefault( v , 0 );
            hm.put( v , hm.getOrDefault(v , 0) +1 );
            
        }
        
        return count;
        
    }
}