class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();
        int i = 0, j = k - 1;
        if (arr.length < k) {
            j = arr.length - 1;
        }
        while (i < arr.length) {
            if (j >= arr.length) {
                j = arr.length - 1;
            }
            int left = i, right = j;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            i = i + 2 * k;
            j = i + k - 1;
        }

        return new String(arr);
    }
}