public class StackWithMin extends Stack<Integer> {
	Stack<Integer> minStack;
	
	public StackWithMin() {
		minStack = new Stack<Integer>();
	}
	
	public void push(int value) {
		if(value <= min()) minStack.push(value);
		super.push(value);
	}
	
	public Integer pop() {
		if(super.isEmpty()) return null;
		int value = super.pop();
		if(value == min()) minStack.pop();
		return value;
	}
	
	public int min() {
		if(minStack.isEmpty()) return Integer.MAX_VALUE;
		else return minStack().peek();
	}
}


public class StackWithMin {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
	
	public StackWithMin() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	public void push(int value) {
		if(minStack.isEmpty() || value <= min()) minStack.push(value);
		stack.push(value);
	}
	
	public Integer pop() {
		if(stack.isEmpty()) return null;
		int value = stack.pop();
		if(value == min()) minStack.pop();
		return value;
	}
	
	public Integer min() {
		if(minStack.isEmpty()) return null;
		return minStack.peek();
	}
}






























