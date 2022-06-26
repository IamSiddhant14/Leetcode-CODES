class Solution {
    public String frequencySort(String s) {
        
        HashMap <Character , Integer> hm = new HashMap<>();
        
        for( int i = 0 ; i<s.length() ; i++ ){
            char a = s.charAt(i);
            hm.put( a , hm.getOrDefault( a , 0 )+1);
        }
        
        HashMap<Integer , ArrayList<Character> > rev = new HashMap<>();

        for( Character a : hm.keySet() ){
            int v = hm.get(a);
            
            if( rev.containsKey(v) == false ){
                rev.put( v , new ArrayList());
            }
            
            rev.get(v).add(a);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for( int i = s.length() ; i>0 ; i-- ){
            
            if( rev.containsKey(i) ){
                
                ArrayList<Character> a = rev.get(i) ;
                
                for( Character b : a ){
                    
                    for( int j = 0; j<i ; j++ ){
                        
                        sb.append(b);
                    }
                    
                }
                
            }
            
        }
        
        String sa = sb.toString();
        
        return sa;
        
    }
}

