class Solution {
    public int maximumLengthSubstring(String s) {

        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        arr[s.charAt(0) -'a']++;
        int r = 0, l = 1;

        while (l < s.length()) {

            int c = s.charAt(l) - 'a';
            arr[c]++;

            while (arr[c] > 2) {
                int ch = s.charAt(r) - 'a';
                arr[ch]--;
                r++;
            }

            max = Math.max(max, (l - r)+1);
            l++;
        }

        return max;

    }
}