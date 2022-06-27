class Solution {
    
    static class Pair{
        
        char ch ;
        int freq ;
        
        Pair( char a , int b ){
            this.ch = a;
            this.freq = b;
        }
    }
    
    static class FreqComp implements Comparator<Pair> {
        
        public int compare ( Pair a, Pair b ){
            
            if( a.freq == b.freq ){
                return a.ch - b.ch ;
            }
            
            return b.freq - a.freq ;
        }
    }
    
    
    public String reorganizeString(String s) {
        
        HashMap <Character , Integer> hm = new HashMap<>();
        
        for( int i = 0; i<s.length() ; i++){
    
            char a = s.charAt(i);
            hm.put( a , hm.getOrDefault( a , 0 ) + 1 );
            
        }
        
        PriorityQueue <Pair> pq = new PriorityQueue<>(new FreqComp());
        
        for( Character c : hm.keySet() ){
            
            int freq = hm.get(c) ;
            Pair p = new Pair( c , freq );
            
            pq.add(p);
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        while( pq.size() > 0 ){
            
            Pair a = pq.remove();
            
            sb.append(a.ch);
            a.freq = a.freq-1;
            
            if( pq.size() == 0 && a.freq > 0 ){
                return "";
            }
            
            if( pq.size()> 0 ){
                
                Pair b = pq.remove();
                sb.append(b.ch);
                
                if( b.freq > 1 ){                  
                     b.freq = b.freq-1;
                     pq.add(b);
                }
                
                if( a.freq > 0 ){
                    pq.add(a);
                }

            }
            
        }
        
        String ans = sb.toString();
        return ans;
        
        
    }
}