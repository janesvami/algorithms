package brackets;

import java.util.HashMap;
import java.util.Stack;

public class BracketsCheckerWithStack implements BracketChecker {
    @Override
    public boolean bracketsCheck(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        char[] chars = s.toCharArray();

        for (char bracket : chars) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (stack.empty() || map.get(bracket) != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
