import java.util.HashMap;
import java.util.Map;

class MapSum {
    private Map<String, Integer> map;

    public MapSum() {
        this.map = new HashMap<>();
    }

    public void insert(String key, int val) {
        if (this.map.containsKey(key)) {
            map.put(key, val);
        }
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;

        for (String str : this.map.keySet()) {
            if (str.startsWith(prefix)) {
                sum += this.map.get(str);
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */