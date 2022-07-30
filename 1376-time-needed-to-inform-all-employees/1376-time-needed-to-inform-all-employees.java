class Pair{
    
    int dest ;
    int t;
    
    Pair( int dest , int t ){
        this.dest = dest;
        this.t = t;
    }
    
}

class Graph{
    
    ArrayList<Pair> [] adj ;
       
    Graph( int n ){
        
        adj = new ArrayList[n];
        
        for( int i=0 ; i<n ; i++ ){
            adj[i] = new ArrayList<>();
        }
            
    }
     
    public void addEdge( int src ,int dest , int t ){
        adj[src].add(new Pair (dest , t ));
    }
    
}

class Solution {
    
    public int findAns( int headID , Graph g , int t ){
        
        int max = 0;
        
        for( Pair ele : g.adj[headID] ){
            max = Math.max( max , findAns( ele.dest , g , ele.t ));
        }
        
        return max+t;
        
        
    }
    
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        int t = 0;
        Graph g = new Graph(n);
        
        for( int i=0 ; i<n ; i++ ){
            
            if( manager[i] == -1 ){
                t = informTime[i];  
            }else{
                g.addEdge( manager[i] , i , informTime[i] );   
            }
            
        }
        
        return findAns( headID , g , t );

    }
}