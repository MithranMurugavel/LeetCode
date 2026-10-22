
import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {

        if (k >= num.length()) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {

            while (k > 0 && !stack.isEmpty()
                    && stack.peek() > c) {
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        // Remove remaining digits from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the number in the correct order
        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        // Remove leading zeros
        int i = 0;

        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }

        result = result.delete(0, i);

        // If nothing remains, return zero
        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}
