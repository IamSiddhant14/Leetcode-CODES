class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> st = new Stack<>();
        
        for( char ele : s.toCharArray() ){
           
            
            if( ele == '('  || ele == '[' || ele == '{' ){
                st.push(ele);
                
            }else{
                
                if( st.size() == 0 ){
                    return false;
                }
                
                if( ele == ')' ){
                
                      if(st.peek() != '('){
                         return false;
                      }

                }else if( ele == ']'){
                
                     if(st.peek() != '['){
                         return false;
                      }
                
                }else if( ele == '}'){
                
                      if(st.peek() != '{'){
                           return false;
                       }
                
                
                }
                
                st.pop();
                
            }
       
        
        }
        
        return st.size()== 0;
    }
    
}