class Solution {
    public int nthUglyNumber(int n) {
        
        int[] arr = new int[n];
        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        arr[0] = 1;
        
        for( int i = 1; i<arr.length; i++ ){
            
            
            if( p1< arr.length && p2< arr.length && p3< arr.length){
                
                int v1 = arr[p1] * 2;
                int v2 = arr[p2] * 3;
                int v3 = arr[p3] * 5;
                
                int min = Math.min( v1 , Math.min( v2 , v3));
            
            if( min == v1 ) p1++;
            if( min == v2 ) p2++;
            if( min == v3 ) p3++;
            
            arr[i] = min;
            
            }
            

        }
        
        return arr[n-1];
        
    }
}