package org.assignment.tlt;

import java.util.Scanner;
import java.util.Stack;

public class Q178_BalancedParentheses {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression to check for balanced parentheses:");
        String input = scanner.nextLine();

        boolean result = isBalanced(input);
        System.out.println("Balanced: " + result);

        /*
        System.out.println("{[()]} => " + isBalanced("{[()]}"));       // true
        System.out.println("{[(])} => " + isBalanced("{[(])}"));       // false
        System.out.println("((())){}[] => " + isBalanced("((())){}[]"));// true
        System.out.println("\"\" => " + isBalanced(""));               // true
        System.out.println("[({})](] => " + isBalanced("[({})](]"));   // false
        */

        scanner.close();
    }
}
