import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinStack ms = new MinStack();
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		
		//ms.display();
		
		System.out.println("void main min  =" + ms.getMin());
		ms.pop();
		
		//ms.display();
		
		System.out.println("void main top " + ms.top());
		
		System.out.println("void main min  =" + ms.getMin());
		

	}
}
