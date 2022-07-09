class Solution {
    
    
    int[][] directions = {{+1, 0}, {-1, 0}, {0, +1}, {0, -1}};
    
    public void DFS(int r, int c, char[][] grid){
       
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length 
           || grid[r][c] == '0' || grid[r][c] == 'N') return;
        
        grid[r][c] = 'N'; 
        for(int[] direction: directions){
            DFS(r + direction[0], c + direction[1], grid);
        }
    }
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
        for( int i = 0; i<grid.length ; i++){
            
            for( int j = 0; j<grid[0].length ; j++ ){
                
                if( grid[i][j] == '1' ){
                    DFS( i, j , grid );
                    count++;
                }
            }
        }
        
        return count;
        
        
    }
}