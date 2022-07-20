class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        boolean [] vis = new boolean[graph.length];
        
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        DFS( vis , graph , temp , ans , 0 , graph.length-1);
        return ans;
        
    }
    
    public void DFS( boolean[] vis , int[][] graph , List<Integer> temp , List<List<Integer>> ans , int src , int dest ){
        
        if( vis[src] == true ) return ;
        
        temp.add(src);
        vis[src] = true;
        
        if( src == dest ){
            ans.add(new ArrayList<>(temp));
        }
        
        for( int ele : graph[src] ){
            DFS( vis , graph , temp , ans , ele , dest );
        }
        
        vis[src] = false;
        temp.remove(temp.size()-1);
        
    }
}