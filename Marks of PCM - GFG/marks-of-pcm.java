// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
		    
		    Solution ob = new Solution();
		    
		    ob.customSort (phy, chem, math, n);
    		for (int i = 0; i < n; ++i)
    			System.out.println(phy[i]+" " + chem[i] + " " + math[i]);

        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        
        PriorityQueue <marks> pq = new PriorityQueue <> ( new Ma() );
        
        for( int i = 0; i<N ; i++ ){
            marks m = new marks( phy[i] , chem[i] , math[i] );
            pq.add(m);
        }
        
        for( int i = 0; i<N; i++ ){
            
            marks b = pq.remove();
            
            phy[i] = b.phy;
            chem[i] = b.chem;
            math[i] = b.math;
            
        }
        
    }
    
    static class Ma implements Comparator <marks> {
        
        public int compare ( marks a1 , marks a2 ){
            
            if( a1.phy < a2.phy ){
                return -1;
                
            }else if( a2.phy < a1.phy ){
                return 1;
                
            }else{
                
                if( a1.chem < a2.chem ){
                    return 1;
                    
                }else if( a2.chem < a1.chem ){
                    return -1;
                    
                }else{
                    
                    return a1.math- a2.math;
                    
                }
                
            }
        }

    }
    
    static class marks{
            
            int phy , chem , math = 0;
            
            marks(int p , int c , int m ){
                this.phy = p;
                this.chem = c;
                this.math = m;
            }
    }
    
    
}
