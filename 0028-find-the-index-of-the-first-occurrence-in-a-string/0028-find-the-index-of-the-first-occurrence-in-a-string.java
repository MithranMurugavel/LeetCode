class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() < needle.length()){
            return -1;
        }
        int l=0;
        int r=needle.length();

        while(r<haystack.length()){

            if(needle.equals(haystack.substring(l,r))){
                return l;
            }
            l++;
            r++;
        }
        return needle.equals(haystack.substring(l,r)) ? l:-1;
    }
}