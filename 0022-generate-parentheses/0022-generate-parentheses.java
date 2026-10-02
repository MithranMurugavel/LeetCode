class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> arr = new ArrayList<>();
        function(arr,new StringBuilder(),0,0,n);
        return arr;
    }
    private void function(List<String> arr, StringBuilder s, int open,int close,int max){

        if(s.length() == max*2){
            arr.add(s.toString());
            return;
        }

        if(open<max){
            s.append("(");
            function(arr,s,open+1,close,max);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open){
            s.append(")");
            function(arr,s,open,close+1,max);
            s.deleteCharAt(s.length()-1);
        }
    }
}