class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
        List<Integer> list=new ArrayList<>();

        for(int i:baskets){
            list.add(i);
        }

        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<list.size();j++){
                if(list.get(j)>=fruits[i]){
                    list.remove(j);
                    break;
                }
            }
        }
        return list.size();
    }
}