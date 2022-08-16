class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        
        for( int i=0 ; i<n ; i++ ){
            int v = nums[i] % ( n+1 );
            nums[v-1] +=( n+1 );
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for( int i =0; i<n ; i++ ){
            if( nums[i] / (n+1) >= 2 ) ans.add(i+1) ;
        }
        
        return ans;        
    }
}