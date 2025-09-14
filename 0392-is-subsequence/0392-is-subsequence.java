class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int p=0;
        int v=0;
        int slen=s.length(),tlen=t.length();
        while(p<slen && v<tlen){

            if(s.charAt(p) == t.charAt(v)){
                p++;
                v++;
            }

            else{
                v++;
            }
        }

        if(p==slen) return true;

        else return false;
    }
}