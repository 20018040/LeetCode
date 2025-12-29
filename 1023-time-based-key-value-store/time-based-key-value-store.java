class TimeMap {
    private Map<String, List<Pair<Integer, String>>> map = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair<>(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> list = map.get(key);
        if (list == null) return "";
        int left = 0;
        int right = map.get(key).size()-1;
        int middle = 0;
        String result = "";
        while(left<=right){
            middle = (left + right)/2;
            int time = list.get(middle).getKey();
            if(time <= timestamp){
                result = list.get(middle).getValue();
                left = middle+1;
            }
            else right = middle-1;
            
        }
        
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */