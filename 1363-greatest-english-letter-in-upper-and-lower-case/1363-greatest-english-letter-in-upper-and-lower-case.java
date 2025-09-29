class Solution {
    public String greatestLetter(String s) {
        
        int[] arr = new int[26];

        for(char c:s.toCharArray()){
            int i= (int)c;
            if(i>=97 && i<=122){
                arr[c-'a']++;
            }
        }
        int max=Integer.MIN_VALUE;
        String str="";
        for(char c: s.toCharArray()){
            int i = (int)c;

            if(i>=65 && i<=90){
                if(arr[i-'A']>0 && max<i){
                max=i; str=Character.toString(c);}
            }
        }

        return str;
    }
}