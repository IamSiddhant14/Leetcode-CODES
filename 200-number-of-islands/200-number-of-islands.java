class Solution {
    
    static int[][] dir = { {1,0} , {0,1} , {-1,0} , {0,-1} };

    public void DFS(int i , int j , char[][] grid ){
        
        if( i < 0 || j < 0  || i >= grid.length || j >= grid[0].length  || grid[i][j] == 'N' || grid[i][j] == '0' ){
            return;
        }
        
        grid[i][j] = 'N';
        
        for( int k =0 ; k<dir.length ; k++ ){
           DFS( i+dir[k][0] , j+dir[k][1] , grid ) ;
        }
        
    }
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
        for( int i = 0; i<grid.length ; i++ ){
            
            for( int j = 0; j<grid[0].length ; j++ ){
                
                if( grid[i][j] == '1' ){
                    
                    DFS( i , j , grid );
                    count += 1;
                    
                }
            }
        }
        
        return count;
        
    }
}