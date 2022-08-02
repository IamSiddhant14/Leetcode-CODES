class Solution {
    
    public boolean DFS( int src , int[][] graph , int[] vis , int level ){
        
        if( vis[src] != -1 ){
            if( vis[src] != level%2 ) return false;
            return true;
        }
        
        vis[src] = level%2;
        for( int nbr : graph[src] ){
            if( DFS( nbr , graph , vis , level+1 ) == false ) return false;
        }
        
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int[] vis = new int[n];
        
        Arrays.fill( vis , -1 );
        for( int i =0; i<n ; i++ ){
            
            if( vis[i] == -1 && DFS( i , graph , vis , 0 ) == false )
                return false;
            
        }
        
        return true;
    }
}