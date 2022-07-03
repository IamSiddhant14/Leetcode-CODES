class Solution {
    
    public void findAns( int src , int dest , int[][] graph , boolean[] vis , List<Integer> pair , List<List<Integer>> pairs){
        
        if( vis[src] == true ) return;//loop detection
        
        vis[src] = true;
        pair.add(src);
        
        if( src == dest ){
            pairs.add(new ArrayList(pair));// Deep copy is essential or else it will be ointing to the same node in which we are removing element
            vis[src] = false;
            pair.remove(pair.size() -1);
            return;
            
        };
        
        for( int v : graph[src]){
            findAns( v , dest , graph , vis , pair , pairs );
        }
        
        vis[src] = false;
        pair.remove(pair.size() -1);
        return;

    }
    
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<Integer> Pair = new ArrayList<>();
        List<List<Integer>> Pairs = new ArrayList<>();
        
        boolean[] vis = new boolean[graph.length];
        
        findAns( 0 , graph.length -1 , graph , vis , Pair , Pairs );
        return Pairs;
        
    }
    
    
    
    
}

