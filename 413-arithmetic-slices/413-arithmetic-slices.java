class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        
        int [] ans = new int[a.length];
        int total = 0 ;
        
        for( int i =2; i<a.length ; i++){
            
             if( a[i] - a[i-1] == a[i-1] - a[i-2]){
                 ans[i] = ans[i-1]+1;
             }else{
                ans[i] = 0;
             }
            
            total += ans[i];
        }
        
        return total;
        
    }
}