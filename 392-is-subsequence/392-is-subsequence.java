class Solution {
    public boolean isSubsequence(String s, String b) {
        
        int a1 = 0;
        int a2 = 0;
        
        int v = 0;
        while( a1 < s.length() && a2 < b.length() ){
         
            int c1 = s.charAt(a1);
            int c2 = b.charAt(a2);
            
            if( c1 == c2 ){
                a1++;
                a2++;
                v++;
                
            }else{
                a2++;
                
            }
        }
        
        if( v == s.length() ){
            return true;
        }
        
        return false;
    }
}