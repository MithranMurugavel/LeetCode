class Solution {
    public int canBeTypedWords(String text, String broken) {
        
        String[] split= text.split(" ");

        int count=0;

        Set<Character> set=new HashSet<>();

        for(char c:broken.toCharArray()) set.add(c);

        for(String s:split){
            boolean flag=true;
            for(char c:s.toCharArray()){
                if(set.contains(c)){
                    flag=false;
                    break;
                }
            }

            if(flag) count++;
        }

        return count;
    }
}