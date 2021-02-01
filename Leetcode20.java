class Solution {
    public boolean isValid(String exp) {
        
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<exp.length()){
            
            if(exp.charAt(i)=='('|| exp.charAt(i)=='{' || exp.charAt(i)=='['){
                s.push(exp.charAt(i));
            }
            
            if(exp.charAt(i)==')'|| exp.charAt(i)=='}' || exp.charAt(i)==']'){
                
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && exp.charAt(i)==')'){
                    s.pop();
                }else if(s.peek()=='[' && exp.charAt(i)==']'){
                    s.pop();
                }else if(s.peek()=='{' && exp.charAt(i)=='}'){
                    s.pop();
                }else{
                    return false;
                }
                
                
                    
            }
            
            i++;
            
            
        }
        
        return s.isEmpty();
        
    }
}
