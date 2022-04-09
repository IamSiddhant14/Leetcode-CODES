class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] r = nsr (heights);
        int[] l = nsl (heights);
        int maxA = Integer.MIN_VALUE;
        
        for( int i = 0 ; i<heights.length ; i++){
            
            int width = r[i] - l[i] - 1;
            maxA = Math.max(maxA , (width * heights[i]) ); 
            maxA = Math.max(maxA , (1 * heights[i]) ); 
        }
        
        return maxA ;

    }
    
    
    public int[] nsl( int[] arr ){
        
        int n = arr.length ;
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        Arrays.fill( ans , -1 );
        
        for(int i = n-1 ; i >= 0 ; i-- ){
            
           while( st.size() != 0 && arr[st.peek()] > arr[i] ){
               
               int idx = st.pop();
               ans[idx] = i;
           }
            
            st.push(i);
              
        }
        
        return ans;

    }
    
    
    public int[] nsr( int[] arr ){
        
        int n = arr.length ;
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        Arrays.fill( ans , arr.length );
        
        for(int i = 0 ; i < n ; i++ ){
            
           while( st.size() != 0 && arr[st.peek()] > arr[i] ){
               
               int idx = st.pop();
               ans[idx] = i;
           }
            
            st.push(i);
              
        }
        
        return ans;
        
    }
    
}