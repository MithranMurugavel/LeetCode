class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        if(n == 0 || n == 1) return s;
        int srt = 0;
        int end = 0;

        for(int i = 0;i<n;i++){

            int odd = palindrome(s,i,i);
            int even = palindrome(s,i,i+1);

            int maxlen = Math.max(odd,even);

            if(maxlen > end-srt){
                srt = i - (maxlen-1)/2;
                end = i+(maxlen)/2;
            }
        }

        return s.substring(srt,end+1);
    }

    private static int palindrome(String s, int i, int j){
        
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j - i -1;
    }
}