class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> st = new Stack<>();
        int total = 0;
        
        for( int i =0; i<ops.length ; i++){
            
            String ch = ops[i];
            
            if(!ch.equals("D")  && !ch.equals("C") && !ch.equals("+")){
                
                st.push((Integer.valueOf(ch))); 
                total += Integer.valueOf(ch);
                
            }else if( ch.equals("+")){
                
                int a1 = st.pop();
                int a2 = st.pop();
                
                int t = a1 + a2;
                total += t;
                
                st.push(a2);
                st.push(a1);
                
                st.push(t);
                   
            }else if( ch.equals("D") ){
                
                int num = st.peek();                
                num = num*2;
                
                 total += num;
                
                st.push(num);

            }else if( ch.equals("C") ){
                
                int num = st.pop();
                
                 total -= num ;
               
            }
            

        }
        
//         int total = 0;
//         while( st.size() != 0){
            
//             int x = st.pop();
//             total += x;
        
        return total;
            
        }
        
        
        
    }
// /* == address matching
// .equals() value matching
//     '' ==
//     "" .equals