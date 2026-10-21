class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){

            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        Stack<Character> st = new Stack<>();
        String result = "";
        while(!stack.isEmpty()){
              st.push(stack.pop());
        }
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
}