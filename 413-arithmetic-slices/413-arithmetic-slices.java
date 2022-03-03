class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        
        int cval = 0 ;
        int total = 0;
        
        for( int i =2; i<a.length ; i++){
              
            if( a[i] - a[i-1] == a[i-1] - a[i-2]){
                  cval = cval + 1;
            }else{
                cval = 0;
            }
            
            total += cval;
        }
        
        return total;
        
    }
}