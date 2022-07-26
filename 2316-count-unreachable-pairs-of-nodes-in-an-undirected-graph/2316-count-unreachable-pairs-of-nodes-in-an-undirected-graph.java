class Graph{
    
    ArrayList<Integer>[] adj;
    
    Graph(int n){
        
        adj = new ArrayList[n];
        
        for( int i=0; i<n ; i++ ){
            adj[i] = new ArrayList<>();
        }
        
    }
    
    public void addEdge(int src , int dest ){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    
}

class Solution {
    
    
   public static void DFS( List<Integer> temp , boolean[] vis , Graph g , int src ){

      if(vis[src] == true) return;
      vis[src] = true;

      temp.add(src);
      
      for( int ele : g.adj[src] ){
         DFS( temp , vis, g , ele );
      }

   }
    
    
    public long countPairs(int n, int[][] edges) {
        
        Graph g = new Graph(n);
        
        for( int i =0; i<edges.length ;i++ ){
            g.addEdge(edges[i][0] , edges[i][1]);
        }
        
        long count = 0;
        
      boolean[] vis = new boolean[n];

      for( int i=0 ; i<n ; i++ ){
         
         if( vis[i] == false ){

            List<Integer> temp = new ArrayList<Integer>();
            DFS(temp , vis , g , i );
            count =   count +=  (((n*1l) - temp.size() ) * temp.size() ) ;

         }
      }
        
      return count / 2 ;

    }
}