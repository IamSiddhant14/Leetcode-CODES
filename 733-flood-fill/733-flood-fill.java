class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color ) {
        
         findAns( image , sr , sc , color , image[sr][sc]);
        return image;
    }
    
    public void findAns(int[][] image, int sr, int sc, int color , int prev){
        
        if( sr< 0 || sc < 0 || sr >= image.length || sc >= image[0].length ){
            return;
        }
        
        if( image[sr][sc] == color ) return;
            
        if( image[sr][sc] == prev ){
            
        image[sr][sc] = color;
            
        findAns( image , sr , sc-1 , color , prev);
        findAns( image , sr-1 , sc , color , prev);
        findAns( image , sr , sc+1 , color , prev);
        findAns( image , sr+1 , sc , color , prev);
        
        }


    }
}