class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> temp;
    public MyQueue() {
        this.stack = new Stack<Integer>();
        this.temp = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        
        while(stack.size() != 1){
            temp.push(stack.pop());
        }
        int val = stack.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return val;
    }
    
    public int peek() {

        if(stack.isEmpty()) return -1;

        while(stack.size() != 1){
            temp.push(stack.pop());
        }
        int val = stack.peek();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }

        return val;
    }
    
    public boolean empty() {
        
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */