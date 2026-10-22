class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int[] arr;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            boolean flag = true;

            while (!stack.isEmpty() && asteroids[i] < 0) {
                    if (stack.peek() > 0 && stack.peek() <= Math.abs(asteroids[i])) {

                        if (stack.peek() == Math.abs(asteroids[i])) {
                                flag = false;
                                stack.pop();
                                break;
                        }
                        stack.pop();
                    }
                    else if(stack.peek()<0){
                        break;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    stack.push(asteroids[i]);
            }

        arr = new int[stack.size()];
        int i = 0;
        for (int n : stack) {
            arr[i++] = n;
        }

        return arr;
    }
}