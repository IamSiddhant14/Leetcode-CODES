class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        HashMap<Integer , Integer> hm1 = new HashMap<>();
        HashMap<Integer , Integer> hm2 = new HashMap<>();
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for( int ele : nums1 ){
            hm1.put( ele , hm1.getOrDefault(ele , 0)+1);
        }
        
        for( int ele : nums2 ){
            hm2.put( ele , hm2.getOrDefault(ele , 0)+1);
        }
        
        for( int ele : nums1){
            
            if( hm2.containsKey(ele) && hm2.get(ele) > 0 ){
                
                al.add(ele);
                int v = hm2.get(ele); 

                hm2.put(ele , v-1);
            }
        }
        
        int[] ans = new int[al.size()];
        
        for( int i = 0; i<ans.length ; i++ ){
           ans[i] = al.get(i);
        }
        
        return ans;
        
    }
}