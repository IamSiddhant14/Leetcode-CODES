class Graph{
    
    ArrayList<Integer> [] adj ;
    
    Graph(int n){
        
        adj = new ArrayList[n];
        
        for( int i = 0; i<n ; i++){
            adj[i] = new ArrayList<>();
        }
        
    }
    
    public void addEdge( int src , int dest ){
       adj[src].add(dest);
       adj[dest].add(src);
    }
    
}


class Solution {
    
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        //We are been given an edge list we need to convert it to adjacncy list so to do so
        Graph g = new Graph(n);
        
        for( int i = 0; i<edges.length ; i++ ){
            g.addEdge(edges[i][0] , edges[i][1] );
        }
        
        boolean [] vis = new boolean[n];// This is done to avoid loop
        return DFS(src, dest, g , vis );
        
    }
    
    
    public boolean DFS( int src , int dest , Graph g , boolean[] vis ){

        if( src == dest ) return true;
        if( vis[src] == true ) return false;// This is done to avoid loop
        
        vis[src] = true;
        for( int v : g.adj[src] ){
            
            if( DFS(v , dest , g , vis) == true ) return true;
        }
    
        return false;
    
    }
}