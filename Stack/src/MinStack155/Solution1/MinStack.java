package MinStack155.Solution1;

import java.util.Stack;


class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        this.mainStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.empty()) {
            minStack.push(val);
        } else if (!minStack.empty() && val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int popVal=this.mainStack.pop();
        if (popVal==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return this.mainStack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }

}


