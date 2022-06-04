class Solution {
    public int fib(int n) {
        
        int curr  = 0;
        int cnext = 1;
        
        int ans = 0;

        if( n <= 1 ){
            return n;
        }
        
        for( int i = 2 ; i<= n ; i++ ){
           ans = curr+cnext;
            curr = cnext ;
            cnext = ans;
        }
        
        return cnext;
        
    }
}