class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Arrays.sort(nums);

        int max= nums[nums.length-1];

        int[] arr = new int[max+1];

        for(int n:nums){
            arr[n]++;
        }

        int[] temp = Arrays.copyOf(arr,arr.length);

        Arrays.sort(temp);
        max=temp[temp.length-1];
        int count=0;
        for(int i:arr){
            if(max==i) count+=i;
        }

        return count;
    }
}