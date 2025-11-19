class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        List<Integer> list = new ArrayList<>();

        for(int i:nums){
            list.add(i);
        }

        for(Integer n:list){
            if(list.contains(original)){
                original *= 2; 
            }
            else{
                break;
            }
        }
        return original;
    }
}