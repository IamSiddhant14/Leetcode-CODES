class Solution {
    
    public static int[] nsor (int[] arr){
        
        int[] ans = new int[arr.length];
        
        Arrays.fill(ans , arr.length);
        Stack<Integer> st = new Stack <>();
        
        for( int i = 0; i<arr.length ; i++){
            
            while( st.size() != 0 && arr[st.peek()] > arr[i] ){
                int idx = st.pop();
                ans[idx] = i;
                
            }
            
            st.push(i);
            
        }
        
        return ans;
        
        
    }
    
    public static int[] nsol (int[] arr){
        
        int[] ans = new int[arr.length];
        
        Arrays.fill(ans , -1);
        Stack<Integer> st = new Stack <>();
        
        for( int i = arr.length-1; i>= 0 ; i--){
            
            while( st.size() != 0 && arr[st.peek()] > arr[i] ){
                int idx = st.pop();
                ans[idx] = i;
                
            }
            
            st.push(i);
            
        }
        
        return ans;
        
    }
    
    
    public int largestRectangleArea(int[] heights) {
        
        int[] nsr = nsor( heights );
        int[] nsl = nsol( heights );
        
//         for( int ele : nsr ){
//              System.out.print("  " +ele);
//         }
//         System.out.println();
        
//         for( int ele : nsl ){
//              System.out.print("  " +ele);
//         }
        
        
        
        int Max = Integer.MIN_VALUE;
        
        for( int i =0; i < heights.length ; i++){
            
            int width = nsr[i] - nsl[i] - 1; //This is used to determine the width
            int area = heights[i] * width ;
            
            Max = (int)Math.max(area , Max);
             
        }
        
        return Max;
        
        
        
    }
}