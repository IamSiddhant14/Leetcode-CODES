// class Solution {
//     public int[] countBits(int n) {
        
//         int[] ans = new int[n+1];
        
//         for( int i =0; i<=n; i++){
            
//             int val = decToBinary(i);
            
//             int total = 0;
            
//             while( val != 0){
//                 int r = val%10;
//                 val = val/10;
//                 total += r;
//             } 
            
//             ans[i] = total;

//         }
        
//         return ans;

//     }
    
//     public static int decToBinary(int n ){
        
//         int power = 1;
//         int total = 0;
        
//         while( n != 0 ){
           
//             int r = n%2;
//             total += r*power;
            
//             n = n/2;
//             power *= 10;
//         }
        
//         return total;

//     }
// }


class Solution {
    public int[] countBits(int num) {
        
int[] ans = new int[num + 1];
ans [0] = 0;
for(int i = 1; i <= num; i++){
   if(i %2 == 0){
       ans[i] = ans [i/2];
   }else{
       ans[i] = ans[i - 1] + 1;
   }
}
                           
return ans;
    
}}
