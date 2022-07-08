class Graph{
    
    ArrayList<Integer>[] adj ;
    
    Graph(int n){
        
        adj = new ArrayList[n];
        
        for( int i = 0; i<n ; i++ ){
            adj[i] = new ArrayList<>();
        }
        
    }
    
    public void addEdge(int src , int dest ){
        
        adj[src].add(dest);
        adj[dest].add(src);
        
    }
    
}




class Solution {
    
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        
        Graph g = new Graph(n);
        
        for( int i = 0; i<edges.length ; i++ ){
            g.addEdge( edges[i][0] , edges[i][1]);
        }
        
        boolean [] vis = new boolean[n];
        
        return DFS( g , src , dest , vis );
        
        
    }
    
    public boolean DFS( Graph g , int src ,int dest , boolean[] vis ){
        
        if( src == dest ) return true;
        
        if( vis[src] == true) return false;
        
        vis[src] = true;
        
        for( int v : g.adj[src]){
            
            if( DFS( g , v , dest , vis) == true ) return true;
            
        }
        
        return false;
        
    }
    
    
    
}