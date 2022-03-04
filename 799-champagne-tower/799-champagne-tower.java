class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        double [][] res = new double [query_row+2][query_glass+2];
        res[0][0] = (double) poured;
;
        for( int r =0; r <= query_row ; r++){
             for( int c= 0; c <= query_glass ; c++){
                 
                 double tmp = (res[r][c] - 1.0)/2;
                 if( tmp > 0){
                      res[r+1][c] += tmp;
                      res[r+1][c+1] += tmp;
                 }
                               
                   
             }
        }
                               
      return Math.min(1 , res[query_row][query_glass]);
        
    }
}