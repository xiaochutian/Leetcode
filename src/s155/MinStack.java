/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package s155;

import java.util.Stack;

/**
 *
 * @author Xiaochutian
 */
class MinStack {
    private Stack stack = new Stack();
    private int min = 2147483647;
    public void push(int x) {
        if(x<min)
            min = x;
        stack.push(x);
    }

    public void pop() {
        int temp =(int)stack.pop();
        if(temp==min){
            min=2147483647;
            for(int i=0;i<stack.size();i++)
                if((int)stack.elementAt(i)<min)
                    min = (int)stack.elementAt(i);
        }
    }

    public int top() {
        return (int)stack.peek();
    }

    public int getMin() {
        if(stack.empty())
            return 0;
        else
            return min;
    }
}

