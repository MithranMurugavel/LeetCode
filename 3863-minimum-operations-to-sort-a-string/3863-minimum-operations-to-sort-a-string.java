class Solution {
    public int minOperations(String s) {

        
        boolean flag = true;
        int n = s.length();
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) < s.charAt(i - 1)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return 0;
        }
        if(s.length() == 2) return -1;
        char min = 'z';
        char max = 'a';

        for (char c : s.toCharArray()) {
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        if (min == s.charAt(0) || max == s.charAt(n - 1)) {
            return 1;
        }

        for(int i = 1;i<n-1;i++){
            if(min == s.charAt(i) || max == s.charAt(i)){
                return 2;
            }
        }

        return 3;
    }
}