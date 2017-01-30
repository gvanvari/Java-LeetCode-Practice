
public class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length()==0){
            return true;
        }
        
        if(s.length()==1){
        	return false;
        }
        
        if(s.charAt(0)== ')' || s.charAt(0)== ']' || s.charAt(0)== '}'){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
             if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
            	 //System.out.println(s.charAt(i));
                 stack.push(s.charAt(i));
             }
             else if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
            	if(!stack.isEmpty()) {
            	    if(stack.peek().equals('(') && s.charAt(i)==')'){
                        stack.pop();
                    }else if(stack.peek().equals('[') && s.charAt(i)==']'){
                        stack.pop();
                    }else if(stack.peek().equals('{') && s.charAt(i)=='}'){
                        stack.pop();
                    }else{
                	    return false;
                    }
            	}else{
            	    return false;
            	}
                
             }
        }
        
        if(!stack.isEmpty()){
            return false;
        }
        
        return true;
    }
	
	
	public static void main(String[] args) {
		ValidParenthesis vp = new ValidParenthesis();
		System.out.println(vp.isValid("["));

	}

}
