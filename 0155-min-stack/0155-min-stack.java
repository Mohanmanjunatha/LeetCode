class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    int min;

    public MinStack() {
        this.min=Integer.MAX_VALUE;
        this.st=new Stack<>();
        this.minst=new Stack<>();
        this.minst.push(min);
        
    }
    
    public void push(int val) {
        min=Math.min(min,val);
        this.minst.push(min);
        this.st.push(val);
        
        
    }
    
    public void pop() {
        this.st.pop();
        this.minst.pop();
        min=minst.peek();
        
    }
    
    public int top() {
       // return this.st.peek();
        return st.peek();
        
    }
    
    public int getMin() {
      //  return this.min;
        return min;
        
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