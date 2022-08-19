class Solution {
    
    public int count( int[] nums , int val ){
        
        int c = 0;
        
        for( int ele : nums ){
            if( val == ele ){
                c++;
            }
        }
        
        return c;
    }
    
    public List<Integer> majorityElement(int[] nums) {
        
        int m1 = Integer.MIN_VALUE ;
        int m2 = Integer.MIN_VALUE ;
        
        int f1 = 0;
        int f2 = 0;
        
        for( int ele : nums ){
            
            if( ele == m1 ){
                f1++;
                
            }else if ( ele == m2 ){
                f2++;
            
            }else{
                                
                if( f1 == 0 ){
                    m1 = ele;
                    f1 = 1 ;
                    
                }else if( f2 == 0 ){
                    m2 = ele;
                    f2 = 1;
                    
                }else{
                    f1--;
                    f2--;
                }
                
            }

        }
        
        List<Integer> ans = new ArrayList<>();
        
        int n = nums.length;
        
        if( count( nums , m1 ) > (n/3) ){
            ans.add(m1);
            
        }
        
        if( (count( nums , m2 ) > (n/3)) && m1 != m2 ){
            ans.add(m2);
            
        }

        return ans;
        
    }
}