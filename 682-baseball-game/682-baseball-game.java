class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> st = new Stack<>();
        
        for( int i =0; i<ops.length ; i++){
            
            String ch = ops[i];
            
            if(!ch.equals("D")  && !ch.equals("C") && !ch.equals("+")){
                
                st.push((Integer.valueOf(ch))); 
                
            }else if( ch.equals("+")){
                
                int a1 = st.pop();
                int a2 = st.pop();
                
                int t = a1 + a2;
                
                st.push(a2);
                st.push(a1);
                
                st.push(t);
                   
            }else if( ch.equals("D" )){
                
                int num = st.peek();                
                num = num*2;
                
                st.push(num);

            }else if( ch.equals("C")){
                
                st.pop();
               
            }
            

        }
        
        int total = 0;
        while( st.size() != 0){
            
            int x = st.pop();
            total += x;
            
        }
        
        return total;
        
    }
}