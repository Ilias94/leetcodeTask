package org.example.validparanthese;

import java.util.ArrayDeque;

public class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char parentheses : s.toCharArray()) {
            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                stack.push(parentheses);
            } else if (parentheses == ')') {
                if (stack.peek() != null && '(' == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (parentheses == '}') {
                if (stack.peek() != null && '{' == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (parentheses == ']') {
                if (stack.peek() != null && '[' == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
