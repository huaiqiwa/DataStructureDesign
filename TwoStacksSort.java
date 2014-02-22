public static Stack<Integer> sort(Stack<Integer> s) {
	Stack<Integer> r = new Stack<Integer>();
	while(!s.isEmpty()) {
		int num = s.pop();
		while(!r.isEmpty() && r.peek() > num) {
			s.push(r.pop());
		}
		r.push(num);
	}
	return r;
}