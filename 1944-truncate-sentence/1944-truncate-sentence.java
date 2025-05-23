class Solution {
    public String truncateSentence(String s, int k) {
        
        StringBuilder str=new StringBuilder("");

        String[] arr=s.split(" ");


        for(int i=0;i<k;i++){
            str.append(arr[i]);
            str.append(' ');
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}