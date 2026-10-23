class Solution {
    public boolean detectCapitalUse(String word) {
        // first caps // all caps// all small
        int[] arr = {-1,-1,-1};
        if(word.length() == 1) return true;
        int i = 0;

        if(word.charAt(i)>= 'A' && word.charAt(i) <='Z'){
            i = 1;
            arr[0] = 0;
        }
        
        while(i<word.length()){
            
            char c = word.charAt(i);

            if(c >= 'a' && c<= 'z'){
                arr[2] = 0;
            }

            if(c >= 'A' && c<='Z'){
                arr[1] = 0;
            }
            i++;
        }

        if((arr[0] == 0 && arr[1] == 0 && arr[2] != 0) || (arr[0] == 0 && arr[2] == 0 && arr[1] != 0) || (arr[0] != 0 && arr[1] != 0 && arr[2] == 0)){
            return true;
        }

        else{
            return false;
        }
    }
}