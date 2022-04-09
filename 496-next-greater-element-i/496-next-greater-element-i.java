class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] a = getNGR( nums2 );
        
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        for( int i = 0; i<nums2.length ; i++ ){

            hm.put( nums2[i] , a[i] );
        }
        
        int[] ans = new int[nums1.length];
        
        for( int j =0; j<nums1.length ; j++ ){
            
            ans[j] = hm.get(nums1[j]);
        }
        
        return ans;
        
        
    }
    
    public int[] getNGR ( int[] nums2 ){
        
        int n = nums2.length;
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        Arrays.fill(ans , -1);
        
        for( int i = 0; i<n ; i++ ){
            
            while( st.size() > 0 && nums2[st.peek()] < nums2[i]  ){
                
                int idx = st.pop();
                ans[idx] = nums2[i];
            }
            
            st.push(i);
        }
        
        return ans;
        
        
    }
}