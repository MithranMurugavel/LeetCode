class Solution {
    public int findFinalValue(int[] nums, int original) {
        

        List<Integer> list=new ArrayList<>();

        for(int i:nums){
            list.add(i);
        }

        for(int i:nums){
            if(list.contains(original)){
                original*=2;
            }
            else{
                return original;
            }
        }
        int temp = nums[0];
        return (temp*2);
    }
}