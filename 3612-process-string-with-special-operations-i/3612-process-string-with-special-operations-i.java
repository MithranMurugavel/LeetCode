class Solution {
    public String processStr(String s) {
        
        int n = s.length();
        String result = "";
        int i = 0;
        while(i<n){
            int len = result.length();
            if(s.charAt(i) == '#'){
                result +=result;
            }
            else if(s.charAt(i) == '%'){
                StringBuilder str = new StringBuilder(result);
                str.reverse();
                result = str.toString();
            }
            else if(s.charAt(i) == '*'){
                if(len > 1){
                    result = result.substring(0,len-1);
                }
                else{
                    result ="";
                }
            }
            else{
                result+=s.charAt(i);
            }
            i++;
        }

        return result;
    }
}