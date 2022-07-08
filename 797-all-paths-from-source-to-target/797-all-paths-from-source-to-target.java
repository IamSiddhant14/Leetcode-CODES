class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       
        List<List<Integer>> pairs = new ArrayList<>();
        List<Integer> pair = new ArrayList<>();
        
        boolean[] vis = new boolean[graph.length];
        DFS( 0 , graph.length-1 , graph , vis , pair , pairs );
        
        return pairs;
    }
    
    public void DFS( int src , int dest , int[][] graph , boolean[] vis , List<Integer> pair , List<List<Integer>> pairs  ){
        
        if( vis[src] == true ) return ;
                
        pair.add(src);
        vis[src] = true;
        
        if( src == dest ){
            pairs.add(new ArrayList(pair));// Deep copy is essential or else it will be ointing to the same node in which we are removing element            
        };
        
        for( int v : graph[src]){
            DFS( v , dest , graph , vis , pair , pairs );
        }
        
        vis[src] = false;
        pair.remove( pair.size() -1 );
        
    }
}