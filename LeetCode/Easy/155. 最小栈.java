// Salution: Auxiliary Stack
// Difficulty Level: easy


class MinStack {

	private Stack stackSimulation = new Stack();
	private Stack stackMin = new Stack();
	private int minValue;

    public MinStack() {

    }
    
    public void push(int val) {
    	if(stackSimulation.size() == 0) {
    		minValue = val;
    	}

    	if(stackMin.size() != 0) {
    		minValue = (int)stackMin.peek();
    	}

    	minValue = Math.min(minValue, val);

    	stackSimulation.push(val);
    	stackMin.push(minValue);
    }
    
    public void pop() {
    	stackMin.pop();
    	stackSimulation.pop();
    }
    
    public int top() {
    	return (int)stackSimulation.peek();
    }
    
    public int getMin() {
    	return (int)stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

//=========================================================

// Salution: Auxiliary Stack
// Difficulty Level: easy

class MinStack {

	Stack<int[]> stack = new Stack();

    public MinStack() {

    }
    
    public void push(int val) {	
    	if(stack.size() == 0) {
    		stack.push(new int[]{val, val});
    	} else {
    		stack.push(new int[]{val, Math.min(val, stack.peek()[1])});
    	}

    }
    
    public void pop() {
    	stack.pop();
    }
    
    public int top() {
    	return stack.peek()[0];
    }
    
    public int getMin() {
    	return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */