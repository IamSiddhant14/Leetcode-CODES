class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[k];
        
        for( int ele : nums ){
           hm.put(ele , hm.getOrDefault(ele , 0)+1);
        }
        
        for( int i =0; i<k; i++){
            
            int m1 = 0;
            int el = 0;
            
            for( int ele : hm.keySet()){
             
                int val = hm.get(ele);
                
                if( val > m1){
                    
                 m1 = val;
                 el = ele;
                    
                }
             
            }
            
            hm.remove(el);
            ans[i]= el;

        }
        
        return ans;
         
        
        
        
    }
}