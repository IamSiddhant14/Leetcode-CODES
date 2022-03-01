class Solution {
    public int findKthLargest(int[] arr, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for( int ele : arr){
             pq.add(ele);
        }
        
        for( int i = 1; i<k; i++){
            pq.remove();
        }
        
        int val =  pq.remove();
        return val;
        
        
    }
}