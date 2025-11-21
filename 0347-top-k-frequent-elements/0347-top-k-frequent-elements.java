class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        Queue<Integer> queue = new PriorityQueue<>( (a,b) -> Integer.compare(map.get(a),map.get(b)));

        for(int n:map.keySet()){
            queue.add(n);

            if(queue.size()>k){
                queue.poll();
            }
        }

        int[] arr = new int[queue.size()];

        for(int i=0;i<k;i++){
            arr[i] = queue.poll();
        }

        return arr;
    }
}