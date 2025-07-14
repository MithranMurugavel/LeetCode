class Solution {
    public int matchPlayersAndTrainers(int[] pl, int[] tr) {
        
        Arrays.sort(pl);
        Arrays.sort(tr);

        int ptr=pl.length-1;
        int ptr1=tr.length-1;
        int count=0;
        while(ptr>=0 && ptr1>=0){
            if(pl[ptr]<=tr[ptr1]){
                count++;
            }
            else{
                ptr--;
                continue;
            }
            ptr--;
            ptr1--;
        }
        return count;
    }
}