class Solution {
    public int distributeCandies(int[] candyType) {
        
        Set<Integer> set = new HashSet<>();
        int len = candyType.length / 2;
        int count = 0;
        for(int i =0;i<candyType.length;i++){

            if(!set.contains(candyType[i])){
                count++;
                set.add(candyType[i]);
            }

            if(len == count){
                break;
            }
        }

        return count;
    }
}