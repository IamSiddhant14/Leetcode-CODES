class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        int l = 0;
        for( int i = l ; l < k ; l++ ){
            pq.add(nums[l]);
        }
        
        for( int j = l; j<nums.length ; j++ ){
            
            if( pq.peek() < nums[j] ){
                pq.remove();
                pq.add(nums[j]);
            }
        }
        
        
       return pq.peek();
        
    }
}