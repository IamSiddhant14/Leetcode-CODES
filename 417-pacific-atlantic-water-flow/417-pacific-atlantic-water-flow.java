class Solution {
    int[][] dir = {{1,0} , {-1, 0} , {0 , 1} , {0 , -1}};
    
    public void DFS( int r , int c , boolean[][] vis , int[][] height){
        
        if( vis[r][c] == true ) return;
        vis[r][c] = true;
        
        for( int i=0 ; i<4 ; i++ ){
            
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];
            
            if( nr < 0 || nc < 0 || nr >= height.length || nc >= height[0] .length ) continue;
            
            if( height[nr][nc] >= height[r][c]  ){
                DFS( nr , nc , vis , height );
            }
        }
        
        
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int n = heights.length ; int m = heights[0].length;
        boolean[][] paf = new boolean[n][m];
        
        for( int i = 0 ; i<m ; i++ )DFS(0 , i , paf , heights );//Top row
        for( int i = 0 ; i<n ; i++ )DFS(i , 0 , paf , heights );//First col
        
        boolean[][] atl = new boolean[n][m];
        
        for( int i = 0 ; i<m ; i++ )DFS(n-1 , i , atl , heights );//Bottom
        for( int i = 0 ; i<n ; i++ )DFS(i , m-1 , atl , heights );//Right
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for( int i = 0; i<n ; i++ ){
           for( int j = 0 ; j<m ; j++ ){
               if( paf[i][j] == true && atl[i][j] == true ){
                   List<Integer> a = new ArrayList<>();
                   a.add(i) ; a.add(j);
                   ans.add(a);
               }
           }
        }
        
        return ans;
        
    }
}