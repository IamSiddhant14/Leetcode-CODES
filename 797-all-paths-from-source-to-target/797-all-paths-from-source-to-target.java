class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public void DFS( int src , int dest , boolean[] vis , List<Integer> temp , int[][] adj ){
        
        if( vis[src] == true ) return  ;

        vis[src] = true;
        temp.add(src);
                
        if( src == dest ){
            ans.add(new ArrayList<>(temp));
            vis[src] = false;
            temp.remove(temp.size()-1 );
            return;
        } 
        
        for( int ele : adj[src] ){
             DFS( ele , dest ,vis , temp ,adj );
        }
        
        
        vis[src] = false;
        if( src != dest ){
            temp.remove(temp.size()-1 );
        }
             
    }
    
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<Integer> temp = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];
        
        DFS( 0 , graph.length-1, vis , temp , graph);
        
        return ans;

    }
    
}