class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
         if(s.length() == 1) return 1;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int l=0,r=0;
        while(r<s.length()){
            char c =s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            count = Math.max(count, r-l+1);
            r++;
        }

        return count;
    }
}