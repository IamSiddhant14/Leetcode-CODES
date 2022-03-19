// class Solution {
//     public boolean checkValidString(String s) {
        
//         Stack<Integer> br = new Stack<>();
//         Stack<Integer> str = new Stack<>();
        
//         for( int i =0; i<s.length() ; i++){
            
//             char ch = s.charAt(i);
            
//             if(ch == '('){
//                 br.push(i);
                
//             }else if( ch == '*' ){
//                 str.push(i);
                
//             }else if( ch == ')'){
                
//                 if( br.size() == 0 ){
                    
//                     if( str.size() > 0 && str.peek() > i  ){
//                         return false;
                        
//                     }else if(str.size() == 0 ){
//                         return false;
                        
//                     }else if( str.size() > 0 && str.peek() < i   ){
//                         str.pop();
//                     }else return false;
                    
//                 }else{
//                     br.pop();
//                 }
//             }
            
            
//         }
        
//         if( br.size() > 0){
            
//             if( br.size() > str.size()){
//                 return false;
//             }
                                        
//             if( str.size() != 0 && br.peek() > str.peek() ){
//                 return false;
//             }
              
//         }
        
        
//         return true ;

//     }
// }








class Solution {
    public boolean checkValidString(String s) {
        int cmin = 0, cmax = 0; // open parentheses count in range [cmin, cmax]
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cmax++;
                cmin++;
            } else if (c == ')') {
                cmax--;
                cmin--;
            } else if (c == '*') {
                cmax++; // if `*` become `(` then openCount++
                cmin--; // if `*` become `)` then openCount--
                // if `*` become `` then nothing happens
                // So openCount will be in new range [cmin-1, cmax+1]
            }
            if (cmax < 0) return false; // Currently, don't have enough open parentheses to match close parentheses-> Invalid
                                        // For example: ())(
            cmin = Math.max(cmin, 0);   // It's invalid if open parentheses count < 0 that's why cmin can't be negative
        }
        return cmin == 0; // Return true if can found `openCount == 0` in range [cmin, cmax]
    }
}
