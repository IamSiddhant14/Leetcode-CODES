class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put( 0 , 1 );
        
        int sum = 0;
        int count = 0;
        
        for( int ele : nums ){
            
            sum += ele ;
            int r = (sum % k + k ) % k;// To avoid negative value;
            
            count = count + hm.getOrDefault( r , 0 )  ;
            hm.put( r, hm.getOrDefault( r , 0 ) + 1 );
        }
        
        return count ;
    }
}