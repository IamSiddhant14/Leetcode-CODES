class Graph{
    
    ArrayList<Integer> [] adj;
    
    Graph( int n ){
        
      adj = new ArrayList[n];
        
        for( int i = 0; i<n ; i++ ){
            adj[i] = new ArrayList<>();
        }
    }
    
    public void addEdge( int src , int dest){
           adj[src].add(dest);
           adj[dest].add(src);
    }
}

class Solution {
    
    public void DFS( Graph g , boolean[] vis , int i ){
        
        if( vis[i] == true ) return ;
        vis[i] = true;
        
        for(int ele : g.adj[i] ){
            DFS( g , vis , ele );
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        
        Graph g = new Graph(isConnected.length);
        for( int i = 0; i < isConnected.length ; i++ ){
            for( int j = 0; j < isConnected[i].length ; j++){
                if( isConnected[i][j] == 1){
                    g.addEdge(i , j);
                }
            }
        }
        
        boolean[] vis = new boolean[isConnected.length];
        int count = 0;
        
        for( int i = 0 ; i<isConnected.length ; i++ ){
            
            if( vis[i] == false ){
                DFS( g , vis , i );
                count++;
            }
            
        }
        
        return count;
        
    }
}