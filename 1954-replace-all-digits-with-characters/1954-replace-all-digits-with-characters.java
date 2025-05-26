class Solution {
    public String replaceDigits(String s) {
        
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){

            if(Character.isDigit(s.charAt(i))){
              int temp=arr[i]-'0';

              arr[i]=(char)((arr[i-1]+temp-'a')%26+'a');
            }
        }
        return new String(arr);
    }
}