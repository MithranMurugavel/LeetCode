class Solution {
    public String makeFancyString(String s) {
        
        char[] result=new char[s.length()];
        int j=0;
        result[j++]=s.charAt(0);
        int count=1;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }

            if(count<3){
                result[j++]=s.charAt(i);
            }
        }
        return new String(result,0,j);
    }
}