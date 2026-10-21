class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && c == '#'){
                stack.pop();
            }
            else if(stack.isEmpty() && c == '#'){
                continue;
            }
            else{
                stack.push(c);
            }
        }
        String result1 = "";
        while(!stack.isEmpty()){
            result1 += stack.pop();
        }
        Stack<Character> stack1 = new Stack<>();
         for(char c:t.toCharArray()){
            if(!stack1.isEmpty() && c == '#'){
                stack1.pop();
            }
            else if(stack1.isEmpty() && c == '#'){
                continue;
            }
            else{
                stack1.push(c);
            }
        }
         System.out.println(stack1);
        String result2 = "";
         while(!stack1.isEmpty()){
            result2 += stack1.pop();
        }
       
        System.out.println(result1 + " "+result2);
        return result1.equals(result2);
    }
}