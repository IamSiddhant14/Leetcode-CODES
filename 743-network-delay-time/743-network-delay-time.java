class Solution {
    
    public static class Pair implements Comparable<Pair> {
        
        int src ;
        int wt ;
        
        Pair( int src , int wt ){
            this.src = src;
            this.wt = wt;
        }
        
        public int compareTo( Pair other ){
            return (this.wt - other.wt);
        }
        
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        ArrayList<Pair> [] adj = new ArrayList[n];
        for( int i=0 ; i<n ; i++ ) adj[i] = new ArrayList<>();
        
        for( int[] edge : times ){
            adj[edge[0]-1].add( new Pair( edge[1]-1 , edge[2]));
        }
        
        int[] vis = new int [n];
        Arrays.fill( vis , Integer.MAX_VALUE );
        
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add( new Pair( k-1 , 0 ));
        
        while( q.size() > 0 ){
            
            Pair front = q.remove();
            
            if( vis[front.src] != Integer.MAX_VALUE) continue;
            vis[front.src] = front.wt;
            
            for( Pair nbr : adj[front.src] ){
                q.add( new Pair( nbr.src , front.wt + nbr.wt ));
            }
        }
        
        int t = 0;
        
        for( int i =0; i<n ; i++ ){
            t = Math.max( vis[i] , t );
        }
        
        return ( t == Integer.MAX_VALUE ) ? -1 : t ;
        
    }
}