class Solution {
    
    int count = 0;
    int[][] dir = {{1,0} , {0,1} , {-1,0} , {0,-1} };
    
    public void DFS( int r , int c , int[][] grid ){
        
        if( r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 || grid[r][c] == -1 ){
            return ;
        }
        
        grid[r][c] = -1;
        count++;
        
        
        for( int i =0; i<dir.length ; i++ ){
            int rb = dir[i][0];
            int cb = dir[i][1];
            
            DFS( r+rb , c+cb , grid );
        }
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