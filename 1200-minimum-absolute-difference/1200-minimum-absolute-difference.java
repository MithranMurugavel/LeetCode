class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i = 1;i<arr.length;i++){
            
                diff = Math.min(diff,arr[i]-arr[i-1]);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i=1;i<arr.length;i++){

            if(arr[i]-arr[i-1] == diff){
                List<Integer> ls = Arrays.asList(arr[i-1],arr[i]);
                list.add(ls);
            }
        }
        
        return list;
    }
}