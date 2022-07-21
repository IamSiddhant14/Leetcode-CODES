class Graph{
    
    ArrayList<Integer> [] adj;
    
    Graph(int n){
        
        adj = new ArrayList[n];
        
        for( int i = 0; i<n ; i++ ){
            adj[i] = new ArrayList<>();  
        }
    }
    
    public void addEdge( int src , int dest ){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    
    public boolean DFS(int src , boolean[] vis , int dest ){
        
        if( src == dest ) return true;
        if( vis[src] == true ) return false;
        
        vis[src] = true;
        
        for( int ele : adj[src]){
            if( DFS( ele , vis , dest ) == true ) return true;
        }
        
        return false;
    }
}

class Solution {
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Graph g = new Graph(n);
        
        for( int i = 0; i<edges.length; i++ ){
            g.addEdge(edges[i][0] , edges[i][1]);
        }
        
        boolean[] vis = new boolean[n];
        
        return g.DFS( source , vis , destination );
        
    }
}