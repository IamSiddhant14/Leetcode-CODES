class Solution {
    public String frequencySort(String s) {
        
        HashMap< Character , Integer > hm = new HashMap<>();
        
        for(int i = 0; i<s.length() ; i++){ 
            char c = s.charAt(i);
            hm.put( c , hm.getOrDefault( c , 0 )+1);
        }
        
        HashMap<Integer , ArrayList<Character> > rev = new HashMap<>();
        
        for( Character ch : hm.keySet()){
            
            int v = hm.get(ch);
            
            if( rev.containsKey(v) == false){
                rev.put( v , new ArrayList<>());
            }
            
            rev.get(v).add(ch);
        }
        
       StringBuilder sb = new StringBuilder();
        
        for( int i = s.length() ; i>0 ; i-- ){
            
            if( rev.containsKey(i) ){
                
                for( Character a : rev.get(i)){
                    
                    for( int j = 0; j<i ; j++ ){
                      sb.append(a);  
                    }
                }
            }
        }
        
        String ans = sb.toString();
        return ans;        
        
        
        
        
        
        
    }
}