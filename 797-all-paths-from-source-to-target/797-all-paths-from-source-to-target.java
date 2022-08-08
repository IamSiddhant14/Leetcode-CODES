class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public void DFS( int src , int dest , List<Integer> temp , int[][] g , boolean [] vis ){
        
        if( vis[src] == true ) return;
        vis[src] = true;
        
        temp.add(src);
        
        if( src == dest ){
            ans.add(new ArrayList<>(temp));
        }
        
        for( int ele : g[src]){
            DFS( ele , dest , temp , g , vis );
        }
        
        temp.remove( temp.size()-1 );
        vis[src] = false;
        
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        boolean[] vis = new boolean[graph.length];
        
        List<Integer> temp = new ArrayList<>();
        DFS( 0  , graph.length-1 , temp , graph , vis );
        
        return ans;
        
    }
}