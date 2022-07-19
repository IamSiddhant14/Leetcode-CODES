class Graph{
    
   List<Integer> [] adj;
    
    Graph( int n ){
        adj = new ArrayList[n];
        
        for( int i = 0; i<n ; i++ ){
            adj[i] = new ArrayList<>();
        }
    }
    
    public void addEdge( int src , int dest ){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    
}

class Solution {
    
    public void DFS( List<Integer> temp , Graph g , int src , boolean[] vis){
        
        if( vis[src] == true ) return;
        
        vis[src] = true;
        temp.add(src);
        
        for( int ele : g.adj[src] ){
            DFS( temp , g , ele , vis );
        }
        
    }
    
    
    
    public long countPairs(int n, int[][] edges) {
        
        Graph g = new Graph(n);
        
        for(int i = 0; i<edges.length ; i++ ){
            g.addEdge(edges[i][0],edges[i][1]);
        }
    
        long count = 0;
        boolean[] vis = new boolean[n];
        
        for( int i=0 ; i<n ; i++ ){
            
            if( vis[i] == false ){
                
                List<Integer> temp = new ArrayList<>();
                DFS( temp , g , i , vis);
                
                count = count + (((n*1l) - temp.size() ) * temp.size() ) ;
            }
            
        }
        
        return count / 2l ;
        
    }
}