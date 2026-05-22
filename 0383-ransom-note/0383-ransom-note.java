class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] carr = new int[26];

        for (char c : magazine.toCharArray()) {
            carr[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            carr[c - 'a']--;
        }

        for (char c : ransomNote.toCharArray()) {
            int ind = c - 'a';
            if (carr[ind] < 0) {
                return false;
            }
        }

        return true;
    }
}