class Solution {
    
    public int fib(int n){
        
        // Approch: 1
        
//         int curr  = 0;
//         int cnext = 1;
        
//         int ans = 0;

//         if( n <= 1 ){
//             return n;
//         }
        
//         for( int i = 2 ; i<= n ; i++ ){
//            ans = curr+cnext;
//             curr = cnext ;
//             cnext = ans;
//         }
        
//         return cnext;
        
         //Approch: 2
        
//         if( n <= 1 ){
//             return n;
//         }
        
//         int a1 = fib(n-1);
//         int a2 = fib(n-2);
        
//         return a1+a2;
        
        int[] dp = new int[n+1];
        Arrays.fill( dp , -1 );
        
        fibAns( n ,  dp);
        return dp[n];
        
    }
    
    public int fibAns(int n , int[] dp) {
        
        //Approch: 3
        
        if( n <= 1 ){
            dp[n] =  n;
            return dp[n];
        }
        
        if( dp[n] != -1 ) return dp[n]; 
        
        int a1 = fib(n-1);
        int a2 = fib(n-2);
        
        dp[n] = a1+a2;
        
        return dp[n];
        
    }
}