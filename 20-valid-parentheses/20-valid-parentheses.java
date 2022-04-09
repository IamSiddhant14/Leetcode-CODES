class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for( char c : s.toCharArray()){

           if( c == '(' || c == '{' || c == '[' ){
               st.push(c);
               
           }else {
               if( st.size() == 0 ){
                   return false;
               }
               
               if( c == ')' ){
                    if( st.peek() != '(' ){
                         return false;
                    }
               }else if( c == '}'){
                    if( st.peek() != '{' ){
                         return false;
                    }                   
               }else if( c == ']'){
                    if( st.peek() != '[' ){
                         return false;
                    }                   
               }
               
               st.pop();
           
           }
        
        }
        
        return st.size() == 0;
        
    }
}