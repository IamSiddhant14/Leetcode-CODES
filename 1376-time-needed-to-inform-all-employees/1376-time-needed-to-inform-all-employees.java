class Pair{
    
    int dest , wt ;
    
    Pair( int dest , int wt ){
        this.dest = dest;
        this.wt = wt;
    }
    
}

class Graph{
    
    ArrayList<Pair> [] adj;
    
    Graph( int n ){
        
        adj = new ArrayList[n];
        
        for( int i=0 ; i<n ; i++ ){
            adj[i] = new ArrayList<>();
        }
        
    }
    
    public void addEdge( int src , int dest , int wt ){
        adj[src].add(new Pair( dest , wt ));
    }
    
}

class Solution {
    
    public int DFS(int headId , Graph g , int srct ){
        
        int max = 0;
        
        for( Pair ele : g.adj[headId] ){
            max = Math.max( max , DFS(ele.dest , g , ele.wt));
        }
        
        return max+srct;
        
    }
    
    public int numOfMinutes( int n, int headID, int[] manager, int[] informTime ) {
        
        int srct = 0;
        Graph g = new Graph(n);
        
        for( int i = 0 ; i<n ; i++ ){
            
            if( manager[i] == -1 ){
                srct = informTime[i];
            }else{
                g.addEdge( manager[i] , i , informTime[i] );
            }
            
        }
        
        return DFS(headID , g , srct );
        
        
    }
}