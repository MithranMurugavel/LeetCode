class MinStack {

    private List<int[]> stack;
    public MinStack() {
        this.stack = new ArrayList<>();
    }
    public void push(int value) {
        int[] ls = stack.isEmpty() ? new int[]{value,value} : stack.get(stack.size()-1);
        int min = ls[0];
        if(min>value){
            min = value;
        }
        stack.add(new int[]{min,value});
    }
    
    public void pop() {
        
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        
        int[] values = stack.get(stack.size()-1);

        return values[1];
    }
    
    public int getMin() {
    
        int[] values = stack.get(stack.size()-1);

        return values[0];
       
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */