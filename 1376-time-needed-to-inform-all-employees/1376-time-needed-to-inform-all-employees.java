class Pair{
    int nbr;
    int wt;
    
    Pair(int nbr , int wt){
        this.nbr = nbr;
        this.wt = wt;
    }
}

class Graph{
    
    ArrayList<Pair> [] adj;
    
    Graph(int n){
        
        adj = new ArrayList[n];
        
        for( int i=0; i<n ; i++){
            adj[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int src , int dest , int wt ){
        adj[src].add(new Pair(dest , wt));
    }
}

class Solution {
    
    public int DFS( Graph g , int t , int headID ){
        
        int maxt = t;
        
        for( Pair ele : g.adj[headID] ){
           maxt = Math.max( maxt , DFS( g , t+ele.wt , ele.nbr )) ;
        }
        
        return maxt;
    }
    
    
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        Graph g = new Graph(n);
        int time = 0;
        
        for( int i=0; i<n ; i++ ){//i for child , arr[i] = parent
            
            if( manager[i] == -1 ){
                time = informTime[i];
                
            }else{
               g.addEdge(manager[i], i , informTime[i] ) ;
                
            }
            
        }
        
        return DFS( g , time , headID );

    }
}