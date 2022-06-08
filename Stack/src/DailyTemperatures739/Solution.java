package DailyTemperatures739;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] ret=new int[temperatures.length];
        stack.push(0);
        for (int i = 1; i < temperatures.length ; i++) {
            if (!stack.empty() && temperatures[i]> temperatures[stack.peek()]){
                while (!stack.empty() && temperatures[i]> temperatures[stack.peek()]){
                    ret[stack.peek()]=i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }else {
                stack.push(i);
            }
        }

        while (!stack.empty()){
            int idx=stack.pop();
            ret[idx]=0;
        }
        return ret;
    }


}
