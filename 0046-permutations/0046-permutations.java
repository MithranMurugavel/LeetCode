class Solution {

    public void function(int[] num,List<Integer> current,List<List<Integer>> result){

        if(current.size() == num.length){
            result.add(new ArrayList(current));
            return;
        }
        else{
            for(int n: num){
                if(!current.contains(n)){
                    current.add(n);
                    function(num,current,result);
                    current.remove(current.size() -1);
                }
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        function(nums,new ArrayList(),result);
        return result;
    }
}