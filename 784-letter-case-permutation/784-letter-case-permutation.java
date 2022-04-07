class Solution {
    
    
    public ArrayList<String> al = new ArrayList<>();
    public List<String> letterCasePermutation (String s) {
        
       
         letterper(s , "");
         return al;
        
    }
    
    
    
    public void letterper ( String str , String a){
        
        if( str.length() == 0 ){
            al.add(a);
            return ;
        }
        
            char b = str.charAt(0);
            String c = str.substring(1);
            
            // 'A' - S = 'a' - s
            
            if(( b >= 'a' && b <= 'z' ) ||( b >= 'A' && b <= 'Z') ){
                
               
                
                if(  b >= 'a' && b <= 'z' ){
                  char  d = (char)('A' - 'a' + b );
                   letterper(c , a+d );
                   letterper(c , a+b );
                   
                }
                
                if( b >= 'A' && b <= 'Z' ){
                  char  d =  (char)( 'a' + b - 'A') ;
                   letterper(c , a+d );
                   letterper(c , a+b );
                   
                    
                }
                
                
            }else{
                
                letterper(c , a+b);
                
            }
            
            
            

        
            


    
    
    
    
    }
}