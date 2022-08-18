class Solution {
    public int findMaxLength(int[] arr) {
        
        HashMap <Integer , Integer> hm = new HashMap <>();
        hm.put( 0 , -1 );
        
        int sum = 0;
        int longest = 0;
        
        for( int i=0 ; i<arr.length ; i++ ){
            
            if( arr[i] == 0 ){
                sum += -1;
                
            }else{
                sum += arr[i];
                
            }
            
            longest = Math.max( longest , i - hm.getOrDefault( sum , i ));
            if( hm.containsKey(sum) == false ){
                hm.put( sum , i );
            }
            
        }
        
        return longest;
    }
}