class Solution {
    
    int count = 0;
    
    public void DFS( int r , int c , int[][] grid ){
        
        if( r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 || grid[r][c] == -1 ){
            return ;
        }
        
        grid[r][c] = -1;
        count++;
        
        DFS( r+1 , c , grid );
        DFS( r-1 , c , grid );
        DFS( r , c-1 , grid );
        DFS( r , c+1 , grid );
        
    }
    
    public int numEnclaves(int[][] grid) {
        
    int val = 0;
        
        for( int i = 0; i<grid.length ; i++ ){
            for( int j = 0; j<grid[0].length ; j++ ){
                if( i == 0 || j == 0 || i == grid.length-1 || j == grid[0].length-1 ){
                    DFS( i , j , grid );
                    count = 0;
                }
            }
        }
        
        for( int i = 0; i<grid.length ; i++ ){
            for( int j = 0; j<grid[0].length ; j++ ){
                
                if( grid[i][j] == 1 ){
                    DFS( i , j , grid );
                    val += count;
                    count = 0;
                }
            }
        }        
        
        return val;        
    }
}