class TimeMap {
    Map<String,TreeMap<Integer,String>> map = new HashMap<>();
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new TreeMap<>()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> temp = map.get(key);

        if(temp == null) return "";

        Map.Entry<Integer,String> temp1 = temp.floorEntry(timestamp);
        return temp1 == null ? "":temp1.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */