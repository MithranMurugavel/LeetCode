class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length && nums[i]<=0;i++){
            if(i == 0 || nums[i] != nums[i-1]){
                twoSum(nums, i, result);
            }
        }
        return result;
    }

    private void twoSum(int[]nums, int i, List<List<Integer>> list){

        int l=i+1;
        int right = nums.length-1;

        while(l<right){

            int val = nums[l]+nums[right] + nums[i];

            if(val > 0){
                right--;
            }
            else if(val < 0){
                l++;
            }

            else{
                list.add(Arrays.asList(nums[i],nums[l++],nums[right--]));
                while(l<right && nums[l] == nums[l-1]){
                    ++l;
                }
            }
        }
    }
}