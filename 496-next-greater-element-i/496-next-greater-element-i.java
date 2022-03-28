class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] a = ngl(nums2);
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for( int i =0; i<nums2.length; i++){
            hm.put(nums2[i] , a[i]);
        }
        
        for( int i =0; i<nums1.length ; i++){
            nums1[i] = hm.get(nums1[i]);
        }
        
        return nums1;
        
        
    }
    
    
    public static int[] ngl( int[] arr ){
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        
        Arrays.fill(ans , -1);
        
        for( int i = 0; i<arr.length ; i++){
            
            while( st.size() > 0 && arr[st.peek()] < arr[i] ){
                
                int idx = st.pop();
                ans[idx] = arr[i];
                
            }
            
            st.push(i);

        }
        
        return ans;
        
    }
}