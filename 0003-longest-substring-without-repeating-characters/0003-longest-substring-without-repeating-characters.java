class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();

        int i = 0,j = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(j<s.length()){

            char c = s.charAt(j);
            

            while(i<j && set.contains(c)){
                set.remove(s.charAt(i));
                i++;
                count--;
            }
            count++;
            if(count>max){
                max = count;
                
            }
            set.add(c);
            j++;
        }
        System.out.println(count);
        return max<count ? count : max;
    }
}