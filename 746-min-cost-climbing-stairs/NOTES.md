class Solution {
public int minCostClimbingStairs(int[] cost) {
int[] dp = new int[cost.length+1] ;
Arrays.fill( dp , -1 );
int a1 = help( 0 , cost , dp );
int a2 = help( 1 , cost , dp );
return Math.min( a1 , a2 );
}
public int help( int n , int[] cost , int[] dp ){
if( n >= cost.length ) return 0 ;
if( dp[n] != -1 ) return dp[n];
int a1 = ( n+1 <= cost.length - 1 ) ? help( n+1 , cost , dp ) : 0;
int a2 = ( n+2 <= cost.length - 1 ) ? help( n+2 , cost , dp ) : 0;
return dp[n] = Math.min(a1 , a2)+ cost[n];
}
}
​
​
​
​
in greddy at any point we will know the answer unlike having a i choice to choose from
1. here in this question we have two things one is minimum cost and another one is length
​