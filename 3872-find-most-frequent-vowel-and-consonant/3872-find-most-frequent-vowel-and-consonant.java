class Solution {
    public int maxFreqSum(String s) {
        
        int[] vow = {0,4,8,14,20};
        List<Integer> list=new ArrayList<>();
        
        for(int i:vow) list.add(i);
        int[] arr=new int[26];

        for(char c:s.toCharArray()){
            int val= c - 'a';
            arr[val]++;
        }

        int sum=0;
        for(int i:vow){

            if(sum<arr[i]){
                sum=arr[i];
            }
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(!list.contains(i)){
                if(max<arr[i]) max=arr[i];
            }
        }

        return max+sum;
    }
}