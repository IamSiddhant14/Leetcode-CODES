class Solution {

    public int islandPerimeter(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int v = 0;
        int[][] dir = {{-1,0},{0,-1}};
        
        for( int i = 0; i<n ; i++ ){
            for( int j = 0; j<m ; j++ ){
                
                if( grid[i][j] == 1 ){
                    
                    v += 4;
                    for( int k =0; k<dir.length ; k++ ){
                        
                        int r = i + dir[k][0];
                        int c = j + dir[k][1];
                        
                        if( r < 0 || c < 0 || r >= n || c >= m ){
                            continue;
                        }
                        
                        if( grid[r][c] == 1 ){
                            v -= 2;
                        }
                        
                    }
                    
                }
            }
        }
        
        return v;
        
    }
}
