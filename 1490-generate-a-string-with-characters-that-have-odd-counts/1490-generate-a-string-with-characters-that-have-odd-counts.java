class Solution {
    public String generateTheString(int n) {
        
        String str="z";
        int val =0;

        if(n%2 == 1) {
            val=n;
            str="";
        }
        else{
            val=n-1;
        }

        for(int i=0;i<val;i++){
            str+="p";
        }

        return str;
    }
}