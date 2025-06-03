class Solution {
    public int maxPower(String s) {
        
        int count=1;
        int maxval=-1;
        boolean flag=false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
                flag=true;
            }
            else{
                if(maxval<count){
                    maxval=count;
                }
                count=1;
            }
        }
        if(maxval<count)maxval=count;
        if(flag)
        return maxval;
        else{
            return 1;
        }
    }
}