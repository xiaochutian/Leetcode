/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s20;

import java.util.Stack;

/**
 *
 * @author Xiaochutian
 */
public class Solution {

    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        
        if (s.length() % 2 == 1) {
            return false;
        }
        
        Stack stack = new Stack();
        

        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.add(c);
                    break;
                case '}':
                    if (stack.size() == 0) {
                        return false;
                    }
                    if ((char) stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.size() == 0) {
                        return false;
                    }
                    if ((char) stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.size() == 0) {
                        return false;
                    }
                    if ((char) stack.pop() != '(') {
                        return false;
                    }
                    break;
            }

        }
        return stack.size()==0?true:false;
    }
}
