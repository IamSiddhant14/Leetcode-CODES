class Solution {
    public int[][] merge(int[][] arr) {
        
        Stack<int[]> st = new Stack<>();
        
        Arrays.sort(arr, (a,b)->{
            
            return a[0] - b[0];
        });
        
        st.push(arr[0]);
        
        
        
        for( int i =1; i<arr.length ; i++){
            
            int[] a = st.peek();
            int[] b = arr[i];
            
            if( a[1]>= b[0]){
            
                int[] ans = new int[2];
                
                ans[0] = Math.min(a[0],b[0]);
                ans[1] = Math.max(a[1],b[1]);
                
                st.pop();
                st.push(ans);
                
            }else{
                st.push(arr[i]);
            }
            
            
        }
        
        int[][] a = new int[st.size()][2];
        int i =0;
        
        while( st.size() != 0 ){
            
            int[] e = st.pop();
            
            a[i][0] = e[0];
            a[i][1] =e[1] ;
            i++;
        }
        
        return a;
        
        
    }
}