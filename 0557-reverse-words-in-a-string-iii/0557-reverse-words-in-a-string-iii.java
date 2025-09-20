class Solution {
    public String reverseWords(String s) {
        
        String[] split = s.split(" ");

        for(int i=0;i<split.length;i++){
            StringBuilder str = new StringBuilder(split[i]);
            str.reverse();
            split[i]=str.toString();
        }

        String result="";

        for(String i:split){
            result+=i+" ";

        }

        return result.trim();
    }
}