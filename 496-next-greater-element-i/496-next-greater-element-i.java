class Solution {
    

    public static int nge(int[] arr , int idx , int n){
    
        for( int i = idx+1; i<arr.length ; i++){
            
            if( arr[i] > n ){
              return arr[i];
            }
            
        }

        return -1;
        
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        
        for( int i =0; i<nums1.length ; i++){
            
            int idx = -1;
            int n = nums1[i];
            
            for( int j =0; j<nums2.length ; j++){
                
                if( nums2[j] == n){
                   idx = j;
                   int ans = nge( nums2 , idx , n);
                    
                    nums1[i] = ans;
                    break;
                }
                
            }
        }
        
        return nums1;
        
        
        
    }
}