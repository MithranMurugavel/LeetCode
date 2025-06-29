class Solution {
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
    int checkcontains(char c){
        if(s1.contains(String.valueOf(c)))return 1;
        else if(s2.contains(String.valueOf(c))) return 2;
        else return 3;
    }

    public String[] findWords(String[] words) {
        
        List<String> list=new ArrayList<>();
        for(String w:words){
            String temp=w.toLowerCase();
            int val = checkcontains(temp.charAt(0));
            boolean flag=true;
            for(int i=1;i<temp.length();i++){
                if(val!=checkcontains(temp.charAt(i))){
                    flag=false;
                }
            }
            if(flag)list.add(w);
        }

        String[] arr=new String[list.size()];
        int ptr=0;
        for(String s:list){
            arr[ptr++]=s;
        }
        return arr;
    }
}