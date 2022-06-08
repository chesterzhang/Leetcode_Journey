package MinStack155.Solution2;


import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    int minVal;

    public MinStack() {
        this.stack=new Stack<>();
        this.minVal=0;
    }

    public void push(int val) {
        if (stack.empty()){
            stack.push( val);
            minVal=val;
        }else {
            stack.push(val-minVal);
            if (val<minVal){
                minVal=val;
            }
        }
    }

    public void pop() {
        if (this.stack.peek() <0 ){
            this.minVal=this.minVal-this.stack.pop();
        }else {
            this.stack.pop();
        }
    }

    public int top() {
        if (this.stack.size()==1){
            return (int) stack.peek();
        }

        if (this.stack.peek() <0 ){
            return  (int)this.minVal;
        }else {
            return  this.minVal+this.stack.peek();
        }
    }

    public int getMin() {
        return this.minVal;
    }

}



