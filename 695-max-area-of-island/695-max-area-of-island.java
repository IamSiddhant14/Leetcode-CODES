class Solution {
    
    public int DFS(int[][] grid , int r , int c ){
        
        if( r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0 || grid[r][c] == -1 )
        {
            return 0;
        }
        
        grid[r][c] = -1;
        int area = 1;
        
        area += DFS( grid , r+1 , c );
        area += DFS( grid , r , c-1 );
        area += DFS( grid , r-1 , c );
        area += DFS( grid , r , c+1 );
        
        return area;

    }
    
    public int maxAreaOfIsland(int[][] grid) {
        
        if (grid.length == 0) return 0;
        int Max = 0;
        
        for( int i = 0; i<grid.length ; i++ ){
            
            for( int j = 0; j<grid[0].length ; j++){  
                if( grid[i][j] == 1 ){
                  Max = Math.max(Max,DFS( grid , i , j )); 
                }
            }
        }
        
        
        return Max;
        
    }
}