class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int i = 0, j = arr.length - 1;

        while (i < j) {

            int mid = i + (j - i) / 2;

            if (mid > 0 && mid < arr.length - 1 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {

                return mid;

            } else if (arr[mid + 1] > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return j;
    }
}