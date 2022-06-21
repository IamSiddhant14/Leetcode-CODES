class Solution {
    public String frequencySort(String s) {
        
        HashMap <Character,Integer> hm1 = new HashMap<>();
        
        for( int i = 0; i<s.length() ; i++ ){
             hm1.put( s.charAt(i) , hm1.getOrDefault(s.charAt(i) , 0 )+ 1);
        }
        
        HashMap<Integer , ArrayList<Character> > hm2 = new HashMap<>();
        
        for( Character c : hm1.keySet() ){
            
           int v = hm1.get(c);
           if( hm2.containsKey(v) == false ){
               hm2.put( v , new ArrayList<>());
           }
            
           hm2.get(v).add(c);
        }
        
        StringBuilder res = new StringBuilder("");
        for( int i = s.length(); i >= 1 ; i-- ){
            if( hm2.containsKey(i) ){
                for( Character ch : hm2.get(i) ){
                    for( int j = 1; j <=i ; j++ ){
                        res.append(ch);
                    }
                }
            }
        }
        
        return res.toString();
        
        
    }
}