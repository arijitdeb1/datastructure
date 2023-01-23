package com.arijit.stack;

import java.util.Stack;

public class ParenthesesExpression {

    public static void main(String[] args) {

        String parentheses = "[{()}{()}]";
        boolean isExpressionValid  = false;

        Stack<Character> parenthesesStack = new Stack<>();

        for(int i=0;i<parentheses.length();i++){
            if(i>0 && !parenthesesStack.isEmpty()
                    && validateParentheses(parenthesesStack,parentheses,i)){
                Character popd = parenthesesStack.pop();
                continue;
            }else {
                parenthesesStack.add(parentheses.charAt(i));
            }

        }
        if(parenthesesStack.isEmpty()) System.out.println("valid expression");
        else System.out.println("invalid expression");
    }

    private static boolean validateParentheses(Stack<Character> parenthesesStack, String parentheses, int index){

        return ((parenthesesStack.peek() == '(' && parentheses.charAt(index) == ')') ||
                (parenthesesStack.peek() == '{' && parentheses.charAt(index) == '}') ||
                (parenthesesStack.peek() == '[' && parentheses.charAt(index) == ']'));


    }
}
