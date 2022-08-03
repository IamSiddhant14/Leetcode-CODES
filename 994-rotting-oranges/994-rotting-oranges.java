class Pair{
    
    int r ;
    int c ;
    int dist;
    
    Pair( int r , int c , int dist ){
        this.r = r;
        this.c = c;
        this.dist = dist;
    }
    
}

class Solution {
    
    int[][] dir = {{1, 0 } , {0,1} ,{-1 , 0} , {0 , -1}};
    
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        
        for( int i =0; i<n ; i++ ){
            for( int j =0; j<grid[0].length ; j++ ){
                if( grid[i][j] == 2 ){
                    q.add(new Pair( i , j , 0 ));
                }
            }
        }
        
        int min = 0;
        while( q.size() > 0 ){
            
            Pair front = q.remove();
            int ia = front.r , ja = front.c ;
            
            if( grid[ia][ja] == 3 ) continue;
            grid[ia][ja] = 3;
            
            min = Math.max( min , front.dist );
            
            for( int i =0; i<4 ; i++ ){
                
                int nr = ia + dir[i][0];
                int nc = ja + dir[i][1];
                
                if( nr < 0 || nc < 0 || nr >= n || nc >=  grid[0].length ){
                    continue;
                }
                
                if( grid[nr][nc] == 0 || grid[nr][nc] == 3){
                     continue;
                }
                
                q.add( new Pair( nr , nc , front.dist+1 ));
                
            }
            
        }
        
        for( int i=0 ; i<n ; i++ ){
          for( int j=0 ; j< grid[0].length ; j++ ){
              if( grid[i][j] == 1 ){
                  return -1;
              }
          }
        }
        
        return min;
        
    }
}