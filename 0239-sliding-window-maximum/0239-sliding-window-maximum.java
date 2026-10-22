class Solution {
    public int[] maxSlidingWindow(int[] num, int k) {
        
        Deque<Integer> queue = new LinkedList<>();
        int n = num.length;
        int[] arr = new int[n-k+1];

        for(int i=0;i<num.length;i++){

            if(!queue.isEmpty() && queue.peek()<i-k+1){
                queue.poll();
            }

            while(!queue.isEmpty() && num[queue.peekLast()] < num[i]){
                queue.pollLast();
            }
            queue.offer(i);
            if(i >= k-1){
                arr[i-k+1] = num[queue.peek()];
            }
        }

        return arr;
    }
}