class Solution {
    public char kthCharacter(int k) {
        
        StringBuilder str=new StringBuilder("a");

        while(str.length()<k){
            StringBuilder s=new StringBuilder();
            for(int i=0;i<str.length();i++){
                int ch=str.charAt(i);
                s.append((char)(ch+1));
            }
            str.append(s);
        }
        return str.charAt(k-1);
    }
}