class Solution {
    public int largestRectangleArea (int[] heights) {
        
        int[] nsl = nsol(heights) ;
        int[] nsr = nsor(heights) ;
        
        int maxim = Integer.MIN_VALUE;
        
        for( int i =0; i<heights.length ; i++){
            
            int width = nsr[i] - nsl[i] -1;
            
            int a1 = heights[i]*width;
            int a2 = heights[i]*1;
            
            int a = Math.max(a1 , a2);
            maxim = Math.max(a , maxim);
            
        }
        
        return maxim;
        
        
        
        
        
        
        
    }
    
    public static int[] nsol (int[] arr){
        
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        Arrays.fill(ans , -1);
        
        for( int i = arr.length-1; i>= 0 ; i--){
            
            while( st.size()!= 0 && arr[st.peek()] > arr[i] ){
                int idx = st.pop();
                ans[idx] = i;
            }
            
            st.push(i);
        }
        
        return ans;

    
    }
    
    
    public static int[] nsor (int[] arr){
        
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        Arrays.fill(ans , arr.length);
        
        for( int i = 0; i<arr.length ; i++){
            
            while( st.size()!= 0 && arr[st.peek()] > arr[i] ){
                int idx = st.pop();
                ans[idx] = i;
            }
            
            st.push(i);
        }
        
        return ans;


    
    }
}