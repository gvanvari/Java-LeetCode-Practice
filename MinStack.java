import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stackMin = new Stack<Integer>();
        
    public MinStack() {
    }
    
    public void push(int x) {
        stack.push(x);
        if(stackMin.isEmpty()){
            stackMin.push(x);
        }else{
            if(stackMin.peek()<x){
                stackMin.push(stackMin.peek());
            }
            else{
                stackMin.push(x);
            }
        }
    }
    
    public void pop() {
         stack.pop();
         stackMin.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stackMin.peek();
    }
	
}
