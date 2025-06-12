class Solution {
    public boolean checkIfPangram(String s) {
        
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            int val=s.charAt(i) - 'a';
            arr[val]++;
        }

        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}