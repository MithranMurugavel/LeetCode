class Solution {

    public static int stringToNumber(String s) {
        int i = 0;
        int neg = 1;
        if (s.charAt(0) == '-') {
            neg = -neg;
            i = 1;
        }

        int sum = 0;

        while (i < s.length()) {
            int c = s.charAt(i) - '0';
            sum = sum * 10 + c;
            i++;
        }

        return sum * neg;
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {
                int s1 = stack.pop();
                int s2 = stack.pop();
                switch (tokens[i]) {
                    case "+": {
                        stack.push(s1 + s2);
                        break;
                    }
                    case "-": {
                        stack.push(s2 - s1);
                        break;
                    }
                    case "/": {
                        stack.push(s2 / s1);
                        break;
                    }
                    case "*": {
                        stack.push(s1 * s2);
                        break;
                    }
                }
            }
            else {
                stack.push(stringToNumber(tokens[i]));
            } 
            
        }

        return stack.pop();
    }
}