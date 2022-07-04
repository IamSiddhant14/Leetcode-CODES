class Solution {
    
    public void DFS( int[][] image, int sr, int sc, int color , int ogColor ){
        
        if( sr< 0 || sc < 0 || sr >= image.length || sc >= image[0].length ){
            return;
        }
        
        if( image[sr][sc] != ogColor ){
            return;
        }
        
        image[sr][sc] = color;
        
        DFS(image , sr , sc-1, color , ogColor );
        DFS(image , sr-1 , sc, color , ogColor );
        DFS(image , sr , sc+1, color , ogColor );
        DFS(image , sr+1 , sc, color , ogColor );
      
    }
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if( image[sr][sc] == color ) return image ;
        
        DFS( image , sr , sc , color , image[sr][sc]);
        return image;
        
    }
}