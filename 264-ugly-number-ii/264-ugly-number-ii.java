class Solution {
    public int nthUglyNumber(int n) {
        if( n == 1 ) return 1;
        
        ArrayList<Integer> ugly = new ArrayList<>();
         
        int prev2 = 0 , prev3 = 0 , prev5 = 0;
        ugly.add(1);// Adding 1 at zero index
        
        for( int  i = 1; i<n ; i++ ){
            
            int a = ugly.get(prev2) * 2;
            int b = ugly.get(prev3) * 3;
            int c = ugly.get(prev5) * 5;
            
            int min = Math.min( a, Math.min(b , c));
            ugly.add(min);
            
            if( min == a ){
                prev2++;
            }
            
            if( min == b ){
                prev3++;
            }
            
            if( min == c ){
                prev5++;
            }
        }
        
        return ugly.get(n-1);
        
    }
}