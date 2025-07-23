class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] str=s.toCharArray();
        int ptr1=0,ptr2=s.length()-1;

        while(ptr1<ptr2){

            char c1=str[ptr1];
            char c2=str[ptr2];
            if(Character.isLetter(c1) && Character.isLetter(c2)){
                
                str[ptr1]=c2;
                str[ptr2]=c1;
                ptr1++;
                ptr2--;
            }
            else if(Character.isLetter(c1))  ptr2--;

            else if(Character.isLetter(c2)) ptr1++;

            else{
                ptr1++;
                ptr2--;
            }
        }

        return new String(str);
    }
}