class Solution {
    public boolean hasSameDigits(String s) {
        
        int p1=0,p2=1;
        String str = "";
        while(true){
            
            while(p2<s.length()){
                int val =((s.charAt(p1++)-'0') + (s.charAt(p2++) - '0'))% 10;
                str+=Integer.toString(val);
            }

            if(str.length() == 2){
                if(str.charAt(0) == str.charAt(1)) return true;
                else{
                    break;
                }
            }
            p1=0;p2=1;
            s=str;
            str= new String();
            
        }
        return false;
    }
}