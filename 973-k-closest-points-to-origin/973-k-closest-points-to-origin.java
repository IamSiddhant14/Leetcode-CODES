class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<pair> p = new PriorityQueue<> ( new Ecu() );
        
        for( int i = 0; i<points.length ; i++ ){
            
            pair a = new pair();
            a.x = points[i][0];
            a.y = points[i][1];
            
            p.add(a);
    
        }
        
        int[][] ans = new int[k][2];
        
        int j = 0;
        while( j <k ){
            pair c = p.remove();
            ans[j][0] = c.x ;
            ans[j][1] = c.y ;
            
            j++;
        }
        
        return ans;
        
    }
    
    static class Ecu implements Comparator<pair> {
        
        public int compare ( pair a1 , pair a2 ){
            
            double d1 = Math.sqrt( a1.x * a1.x + a1.y * a1.y );
            double d2 = Math.sqrt( a2.x * a2.x + a2.y * a2.y );
            
           if(d1 < d2){
                // Smaller Value -> Higher Priority
                return -1;
            } else if(d1 > d2){
                // Higher Value -> Lower Priority
                return 1;
            } else return 0;
        }
    }
    
    static class pair {
        int x = 0 , y = 0;
    }
    
    
}