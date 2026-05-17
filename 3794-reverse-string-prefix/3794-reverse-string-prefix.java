class Solution {
    public String reversePrefix(String s, int k) {
        
        String result ="";

        for(int i=k-1;i>=0;i--){

            result+=s.charAt(i);
        }  

        result +=s.substring(k,s.length());

        return result;
    }
}