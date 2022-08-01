class Solution {
    
    public int[] BFS( int src ,  ArrayList<Integer>[] adj , int n ){
        
        int[] income = new int[n];
        
        for( int i=0 ; i<adj.length ; i++ ){
            for( int ele : adj[i] ){
                income[ele]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for( int i=0 ; i<income.length ; i++ ){
            if( income[i] == 0 ){
                q.add(i);
            }
        }
        
        int[] ans = new int[n];
        int idx = 0;
        int vis = 0;
        
        while( q.size() > 0 ){
            
            int v = q.remove();
            vis++;
            
            ans[idx++] = v;
            for( int ele : adj[v] ){
                income[ele]--;
                if( income[ele] == 0 ){
                    q.add(ele);
                }
            }
        }
        
        if( vis == n ){
            return ans;
        }
        
        return new int[0];
        
    }
    
    public int[] findOrder(int numCourses, int[][] pre ) {
        
        ArrayList<Integer> [] adj = new ArrayList[numCourses];
        
        for(int i=0 ; i<numCourses ; i++ ){
            adj[i] = new ArrayList<>();
        }
        
        for( int[] ele : pre ){
            adj[ele[1]].add( ele[0]);
        }
        
        return BFS( 0 , adj , numCourses );
        
    }
}