class Solution {
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> st = new Stack<>();
        int score = 0;
        
        for( char c: s.toCharArray() ){
            
            if( c == '('){
                
                st.push(-1);
                
            }else{
                if( st.peek() == -1){
                    st.pop();
                    st.push(1);
                    
                }else if( st.peek() != -1){
                   score= 0;                 
                   while( st.peek() != -1 ){
                       score += st.pop();
                       
                   }
                    
                   st.pop();
                   st.push(score*2);

                    
                }

            }
        }
        
        score = 0;                 //()()
        while( st.size() > 0 ){
             score += st.pop();
                       
        }
                    
        
        return score;
        
    }
}