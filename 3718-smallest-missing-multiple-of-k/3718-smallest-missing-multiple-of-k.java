class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();

        for(int n:nums){
            set.add(n);
        }
        int val = k;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(val)){
                return val;
            }
            val=k*(i+2);
        }
        return val;
    }
}