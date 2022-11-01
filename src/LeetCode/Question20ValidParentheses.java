package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Question20ValidParentheses {

    public static void main(String[] args) {
        Question20ValidParentheses parentheses = new Question20ValidParentheses();
        System.out.println(parentheses.leedCodeSolution("()"));
    }

    private boolean leedCodeSolution(String s){
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char element: charArray){
            if(element == '(' || element == '{' || element == '['){
                stack.push(element);
                continue;
            } else if(stack.empty())
                return false;
            char top = stack.pop();
            if(top == '(' && element != ')')
                return false;
            if(top == '{' && element != '}')
                return false;
            if(top == '[' && element != ']')
                return false;
        }

        return stack.empty();
    }
}
