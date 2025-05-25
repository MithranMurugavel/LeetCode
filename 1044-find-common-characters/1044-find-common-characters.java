class Solution {
    int[] count(String str){
        int[] t=new int[26];

        for(int i:str.toCharArray()){
            t[i-'a']++;
        }
        return t;
    }

    int[] intersection(int[] c1,int[] c2){
        int[] t=new int[26];
        for(int i=0;i<26;i++){
            t[i]=Math.min(c1[i],c2[i]);
        }
        return t;
    }
    public List<String> commonChars(String[] words) {
        
        int[] first=count(words[0]);

        for(int i=1;i<words.length;i++){
            first=intersection(first,count(words[i]));
        }

        List<String> list=new ArrayList<>();

        for(int i=0;i<26;i++){
            if(first[i]!=0){
                char a=(char)('a'+i);
                String s=String.valueOf(a);

                while(first[i]>0){
                    list.add(s);
                    first[i]--;
                }
            }
        }

        return list;
    }
}