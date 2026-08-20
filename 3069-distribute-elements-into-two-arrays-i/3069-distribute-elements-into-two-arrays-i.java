class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int k = 1, l = 1;
        for (int i = 2; i < n; i++) {

            if (arr1[k-1] > arr2[l-1]) {
                arr1[k] = nums[i];
                k++;
            } else {
                arr2[l] = nums[i];
                l++;
            }
        }

       
        for (int val : arr2) {
            if (val == 0) {
                break;
            }
            arr1[k] = val;
            k++;
        }
        return arr1;
    }
}