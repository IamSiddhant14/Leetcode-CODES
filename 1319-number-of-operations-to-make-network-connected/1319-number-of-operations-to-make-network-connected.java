class Graph{
    
    ArrayList<Integer> [] adj;
    
    Graph(int n){
        
        adj = new ArrayList[n];
        
        for( int i=0; i<n ; i++){
            adj[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int src , int dest  ){
        adj[src].add(dest);
        adj[dest].add(src);
    }
    
}

class Solution {

    public void DFS( Graph g , boolean[] vis , List<Integer> temp , int i , List<List<Integer>> ans ){
        
        if(vis[i] == true ){
            return;
        } 
        
        vis[i] = true;
        temp.add(i);
        
        for( int ele : g.adj[i] ){
            DFS( g , vis , temp , ele , ans);
        }
        
    }    
    
    public int makeConnected(int n, int[][] connections) {
        
        Graph g = new Graph(n);
        
        for( int i = 0; i<connections.length ; i++ ){
            g.addEdge(connections[i][0] , connections[i][1]);
        }
        
        boolean[] vis = new boolean[n];
        
        int count = 0;
        int pair = 0;
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for( int i = 0; i<n ; i++){
            
            if( vis[i] == false){
                List<Integer> temp = new ArrayList<>();
                DFS( g , vis , temp , i ,ans);
                
                ans.add(temp);
                pair += (temp.size()-1);
                count++;
            }
        } 
        
       int component = count; 
       int req = count-1;
        
       int extra = connections.length - ( (n-1) - (component-1)) ; 
       if( connections.length < n-1 ){
            return -1;
       }   
        
       if( extra >= req ){
             return req;
       }
        
       return  -1;
        

        
        
        
    }
}