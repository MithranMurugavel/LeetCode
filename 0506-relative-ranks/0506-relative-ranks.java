class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        List<Integer> ls = new ArrayList<>();

        for(int i:score){
            ls.add(i);
        }
        List<Integer> list = new ArrayList<>();

        for(int i:score) list.add(i);

        Collections.sort(list,Collections.reverseOrder());
        String[] arr = new String[score.length];

        for(int i=0;i<score.length;i++){
            int ind=ls.indexOf(list.get(i));
            if(i == 0){
                arr[ind]="Gold Medal";
            }
            if(i == 1){
                arr[ind]="Silver Medal";
            }
            if(i == 2) arr[ind] ="Bronze Medal";
            else if(i>2)
            arr[ind] = Integer.toString(i+1);
        }

        return arr;
    }
}