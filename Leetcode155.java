class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> all;
    Stack<Integer> min;
    
    public MinStack() {
        all=new Stack<>();
        min=new Stack<>();
        
    }
    
    public void push(int x) {
        
        if(min.isEmpty() || min.peek()>=x){
            min.push(x);
        }
        all.push(x);
    }
    
    public void pop() {
        int v=all.pop();
        if(v==min.peek()){
            min.pop();
        }
        
    }
    
    public int top() {
        
        return all.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
