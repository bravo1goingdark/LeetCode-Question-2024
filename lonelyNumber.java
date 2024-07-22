import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lonelyNumber {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> getCountMap = getMap(nums);
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (getCountMap.get(num) == 1 && !getCountMap.containsKey(num-1) && !getCountMap.containsKey(num+1)) {
                ans.add(num);
            }
        }
        return ans;
    }
    private Map<Integer,Integer> getMap(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
