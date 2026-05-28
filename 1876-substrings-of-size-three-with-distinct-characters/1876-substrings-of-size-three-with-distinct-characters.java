class Solution {
    public int countGoodSubstrings(String s) {
        
        int i = 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        while(i<s.length()-2){
            String sub = s.substring(i,i+3);
            boolean flag = true;
            for(char c:sub.toCharArray()){
                if(!set.contains(c)){
                    set.add(c);
                }
                else{
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
            }
            set = new HashSet<>();
            i++;
        }

        return count;
    }
}