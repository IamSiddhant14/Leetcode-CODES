class Solution {
    public String frequencySort(String s) {
        
        HashMap <Character , Integer> hm = new HashMap <>();
        
        for( int i = 0 ; i<s.length() ; i++ ){ 
            char a = s.charAt(i);
            hm.put( a , hm.getOrDefault(a , 0) + 1);   
        }
        
        HashMap <Integer , ArrayList<Character> > rev = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for( char a : hm.keySet() ){
            
            int v = hm.get(a);
            if( rev.containsKey(v) == false ){
                rev.put(v , new ArrayList<>() );
            }
            
            rev.get(v).add(a);
            
        }
        
        for( int i = s.length() ; i>= 1; i-- ){
            
            if( rev.containsKey(i) ){
                
                for( Character a : rev.get(i) ){
                    
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