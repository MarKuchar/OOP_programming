package collections.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {
    public static final char PARENTHESES_OPEN = '(';
    public static final char PARENTHESES_CLOSED = ')';
    public static final char CURLY_BRACES_OPEN = '{';
    public static final char CURLY_BRACES_CLOSED = '}';

    public static void main(String[] args) {
        // java 1.0 legacy
        Stack<String> st = new Stack<>();


        // recommended
        Deque<String> stack = new ArrayDeque<>();
        stack.push("China");
        stack.push("South Korea");
        stack.push("Italy");
        stack.push("Iran");
        stack.push("Japan");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack.size());
        }

        String code = "(a(4) > 9) { foo(a(2)))";
        System.out.println(checkBalance(code));
    }

    /**
     * Return -1 if the code's parens/braces are balanced
     * Return the index of which an imbalance occurs.
     * Return the length of code(String) if ( or{ are never closed
     * @param code source code
     * @return
     */

    public static int checkBalance(String code) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] codeChar = code.toCharArray();
        for (int i = 0; i < code.length(); i++) {
            char ch = codeChar[i];
            if (ch == PARENTHESES_OPEN || ch == CURLY_BRACES_OPEN) {
                stack.push(ch);
            } else if (ch == PARENTHESES_CLOSED) {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if (top == PARENTHESES_OPEN) {
                        stack.pop();
                    } else {
                        return i;
                    }
                } else {
                    return i;
                }
            } else if (ch == CURLY_BRACES_CLOSED) {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if (top == CURLY_BRACES_OPEN) {
                        stack.pop();
                    } else {
                        return i;
                    }
                } else {
                    return i;
                }
            }
        }
        if (stack.isEmpty()) {
            return -1;
        } else {
            return code.length();
        }
    }

}
