class Solution {
    public String largestOddNumber(String num) {
        
        int j=num.length()-1;

        while(j>=0){
            int n=num.charAt(j) -'0';

            if(n % 2 == 1){
                return num.substring(0,j+1);
            }
            j--;
        }

        return new String();
    }
}