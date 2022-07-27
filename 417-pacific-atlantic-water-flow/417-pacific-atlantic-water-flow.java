class Solution {
    
    int[][] dir = {{1,0} , {-1, 0} ,{0,-1} ,{0,1}};
    
    public void DFS( int i , int j , int[][] heights , boolean[][] vis ){
        
        
        if( vis[i][j] == true ) return ;
        vis[i][j] = true;
        
        for(int k =0; k<dir.length ; k++ ){
            
            int r = i+dir[k][0];
            int c = j+dir[k][1];
            if( r < 0 || c < 0 || r >= heights.length || c >= heights[0] .length ) continue;
            
            if( heights[r][c] >= heights[i][j] ){
                DFS( r , c , heights , vis );
            }
            
        }
        
    }
    
    
    public List<List<Integer>> pacificAtlantic(int[][] heights ) {
        
        int r = heights.length;
        int c = heights[0].length;
        
        boolean[][] p = new boolean[r][c];
        
        for( int i = 0; i<c ; i++ ) DFS( 0 , i , heights , p );
        for( int i = 0; i<r ; i++ ) DFS( i , 0 , heights , p );
        
        
        boolean[][] a = new boolean[r][c];
        
        for( int i = 0; i<c ; i++ ) DFS( r-1 , i , heights , a );
        for( int i = 0; i<r ; i++ ) DFS( i , c-1 , heights , a );
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for( int i =0; i<r ; i++ ){
            for(int j =0; j<c ; j++ ){
                if( p[i][j] == true && a[i][j] == true ){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }
        
        return ans;
        
    }
}