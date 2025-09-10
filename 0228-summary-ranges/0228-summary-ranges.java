class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        if(nums.length == 0) return new ArrayList<>();
        List<String> list=new ArrayList<>();
        int s=0;
        int f=0;
        int i=0;
        while(f<nums.length){

           if(nums[s]+i== nums[f]){
            i++;
            f++;
           }
           else{
            if(nums[s]==nums[f-1]){
                list.add(Integer.toString(nums[s]));
                s=f;
                i=1;
                f=f+1;
            }
            else {
                String temp=Integer.toString(nums[s]);
                String temp1=Integer.toString(nums[f-1]);
                s=f;
                i=0;
                
                String result=temp+"->"+temp1;
                list.add(result);
            }
           } 
        }
        if(nums[s]==nums[f-1])
        list.add(Integer.toString(nums[s]));
        else{
        String temp=Integer.toString(nums[s]);
        String temp1=Integer.toString(nums[f-1]);
        String result=temp+"->"+temp1;
        list.add(result);
        }
        

        return list;
    }
}