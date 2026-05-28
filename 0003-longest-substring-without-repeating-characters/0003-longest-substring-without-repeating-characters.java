class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int l=0,r=0;
        int max = Integer.MIN_VALUE;
        while(r<s.length()){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            r++;
            max = Math.max(max,(r-l));

        }

        return max > r-l ? max:r-l;
    }
}