 class Solution {
    /*
first
    x  x  x  x  0  0 x  x  0
    |     |
   prt   ptr2
    ok va-ok
    check for three consucutive values
    eppo ptr vanthu ptr2 ah cross pandra varikum check pananum
    simple aah enakku understand anathu podava da code aah
    ok
    
    
    guys can you explain it once
   */
   
    public int minimumMoves(String s) {
        
        // int ptr=0;
        // int ptr2=2;
        
        // while(ptr)
        char[] characters=s.toCharArray();
        int start=0;
        int count=0;
        while(start<s.length()){
            if(characters[start]=='X'){ //enaa error
                count+=1;
                start+=3;
            }else if(characters[start]=='O'){//itdha charcter la vai like 'o' single quotes  bro can you explain once       
            start++;
                continue;
            }
        }return count;
        
    }
}