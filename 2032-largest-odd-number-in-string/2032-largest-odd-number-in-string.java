class Solution {
    public String largestOddNumber(String num) {
        
        int v=num.charAt(num.length() -1) - '0';
        if(v %2 == 1) return num;
        int i=0,j=-1;    
        boolean flag=false;
        while(i<num.length()){
            int n=num.charAt(i)-'0';

            if(n%2 == 1 && i>j){
                j=i;
                flag =true;
            }
            
            i++;
        }
        return flag ?num.substring(0,j+1):new String();
    }
}