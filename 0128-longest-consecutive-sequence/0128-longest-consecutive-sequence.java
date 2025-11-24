class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();


        for(int n:nums){
                set.add(n);
        }

        int max = 1;
        for(int n:set){

            if(set.contains(n-1)){
                continue;
            }

            else{
                int currnum = n;
                int curr_max = 1;

                while(set.contains(currnum+1)){
                    currnum++;
                    curr_max++;
                }

                max= Math.max(curr_max,max); 
            }
        }

        return max;
    }
}