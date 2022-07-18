
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        boolean[] vis = new boolean[graph.length];
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> temp = new ArrayList<>();
        DFS( vis , graph , 0 , graph.length-1 , temp , ans );
        
        return ans;
        
    }
    
    public void DFS( boolean[] vis , int[][] graph , int src , int dest , List<Integer> temp , List<List<Integer>> ans ){
        
        if( vis[src] == true ) return ;
        
        vis[src] = true;
        temp.add(src);
        
        if( src == dest ){
            ans.add(new ArrayList<>(temp));
            // return;
        }

        for( int ele : graph[src]){
            DFS( vis , graph , ele , dest , temp , ans);
        }
        
        vis[src] = false;
        temp.remove(temp.size()-1);
        

    }  
}