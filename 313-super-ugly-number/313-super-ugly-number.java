class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
        int[] ptr = new int[primes.length];
        ArrayList<Integer> ugly = new ArrayList<>();
        
        ugly.add(1);
        
        for( int i = 1; i<n ; i++ ){
            
            int min = Integer.MAX_VALUE;
            for( int j = 0; j<primes.length ; j++){
                min = Math.min(min , ugly.get(ptr[j]) * primes[j]);
            }
            
            ugly.add(min);
            
            for( int j = 0; j<ptr.length ; j++){
               if( ugly.get(ptr[j]) * primes[j] == min ){
                   ptr[j]++;
               }
            }
            
        }
        
        
        return ugly.get(n-1);
        
    }
}