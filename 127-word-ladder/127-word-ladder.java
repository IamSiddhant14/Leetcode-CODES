class Pair {
    String src ;
    int dist;
    
    Pair( String src , int dist ){
        this.src = src;
        this.dist = dist;
    }
}

class Solution {
    
    public boolean isEdge( String a , String b ){
        
       int count = 0;
        
        for( int i =0; i<a.length() ; i++ ){
            if( a.charAt(i) != b.charAt(i) ){
                count++;
            }
        }
        
        return (count == 1);
    }
    
    public int BFS( String src , String dest , HashMap<String , HashSet<String>> graph ){
        
        Queue<Pair> q = new LinkedList<>();
        q.add( new Pair ( src , 0 ) );
        
        HashMap< String , Integer > vis = new HashMap<>();
        while( q.size() > 0 ){
            
            Pair front = q.remove();
            src = front.src;
            
            int level = front.dist;
            if( vis.containsKey(src) == true ) continue;
            
            vis.put(src , level);
            for( String ele : graph.get(src) ){
                q.add( new Pair( ele , level+1 ));
            }
            
        }
        
        return vis.getOrDefault(dest , -1 )+1;
        
        
        
    }
    
    
    public int ladderLength(String src , String dest, List<String> wordList) {
        
        wordList.add(src);
        HashMap< String , HashSet<String>> graph = new HashMap<>();
        
        for( String word : wordList ){
            graph.put( word , new HashSet<>());
        }
        
        for( int i = 0; i<wordList.size() ; i++ ){
            for( int j = 0; j<wordList.size() ; j++ ){
                String a = wordList.get(i) , b = wordList.get(j);
                if( isEdge( a , b ) == true ){
                    graph.get(a).add(b);
                    graph.get(b).add(a);
                }
            }
        }
        
        return BFS( src , dest , graph );
        
        
        
        
    }
}