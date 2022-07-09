class Solution {
    
int[][] dir = {{1, 0} , {0 , -1} , {-1 , 0 }, {0 , 1}};
    
    public int DFS( int i , int j , int [][] grid ){
        
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1 ){
            return 0;
        }
        
        grid[i][j] = -1;
        
        int ans = 0 ;
       
        for( int[] d : dir ){
            
            ans += DFS( i+d[0] , j+d[1] , grid );
        }
        
        return ans+1;
        
    }
    
    public int maxAreaOfIsland(int [][] grid) {
        
       int ans = 0;
        
        for( int i = 0 ; i<grid.length ; i++ ){
            
            for( int j = 0 ; j<grid[0].length ; j++ ){
                
                if( grid[i][j] == 1 ){
                    ans = Math.max(ans ,  DFS( i , j , grid ));
                }
            }
        }
        
        
        return ans;
        
    }
}