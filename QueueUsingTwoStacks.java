public class MyQueue<T> {
	Stack<T> stackNewest, stackOldest;
	
	public MyQueue() {
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	
	public int size() {
		return stackNewest.size()+stackOldest.size();
	}
	
	public void add(T value) {
		stackNewest.push(value);
	}
	
	private void shiftStacks() {
		while(!stackNewest.isEmpty()) {
			stackOldest.push(stackNewest.pop());
		}
	}
	
	public T peek() {
		if(stackOldest.isEmpty()) shiftStacks();
		return stackOldest.peek();
	}
	
	public T remove() {
		if(stackOldest.isEmpty()) shiftStacks();
		return stackOldest.pop();
	}
}