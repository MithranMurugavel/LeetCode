class RecentCounter {
     List<Integer> ls;
    public RecentCounter() {
        this.ls = new ArrayList<>();
    }
    
    public int ping(int t) {
        ls.add(t);

        int srt = t-3000;
        int nd = t;
        int count = 0;
        for(Integer n:ls){
            if(srt <= n && nd >= n){
                count ++;
            }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */