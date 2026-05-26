class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int count = 0;
        for(char c:word.toCharArray()){

            int ind = c - 'A';

            if(ind >= 0 && ind <= 25){
                arr1[ind]++;
            }
            else{
                ind = c - 'a';
                arr2[ind]++;
            }
        }

        for(int i = 0;i<arr2.length;i++){

            if(arr1[i] != 0 && arr2[i] != 0){
                count++;
            }
        }

        return count;
    }
}