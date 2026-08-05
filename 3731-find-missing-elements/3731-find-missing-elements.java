class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        for (int n : nums) {
            set.add(n);
        }
        int count = min + 1;
        for (int i = min; i < max; i++) {
            if (!set.contains(count)) {
                list.add(count);
            }
            count++;
        }
        return list;
    }
}