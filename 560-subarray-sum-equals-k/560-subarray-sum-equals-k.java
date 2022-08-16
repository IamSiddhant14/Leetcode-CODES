class Solution {
    public int subarraySum(int[] arr, int k) {
        
        HashMap < Integer , Integer > hm = new HashMap<>();
        int count = 0 , sum = 0;
        
        hm.put( 0 , 1 );
        for( int val : arr ){
            sum = sum + val ;
            count = count + hm.getOrDefault(sum-k , 0);
            hm.put( sum , hm.getOrDefault(sum , 0) + 1 );
        }
        
        return count;        
    }
}