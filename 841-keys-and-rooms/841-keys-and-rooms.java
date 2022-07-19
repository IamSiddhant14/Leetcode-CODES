class Solution {
    
    public void DFS( List<List<Integer>> adj , boolean[] vis , List<Integer> temp , int i ){
        
        if(vis[i] == true ){
            return;
        } 
        
        vis[i] = true;
        temp.add(i);
        
        for( int ele : adj.get(i)){
            DFS( adj , vis , temp , ele);
        }
        
    }
    
    public boolean isConnected(List<List<Integer>> adj){
        
        int n = adj.size();
        boolean[] vis = new boolean[n];
        
        int count = 0;
        for( int i = 0; i<n ; i++){
            
            if( count > 1){
                return false;
            }
            
            if( vis[i] == false){
                List<Integer> temp = new ArrayList<>();
                DFS( adj , vis , temp , i);
                count++;
            }
        }
        
        if( count == 1 ){
            return true;
        }
        
        return false;
        
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        return isConnected(rooms);
        
    }
}