import java.util.HashMap;

public class containsDup {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> countStore = new HashMap<>(nums.length);
        for (int number : nums) {
            if (countStore.containsKey(number)) {
                int value = countStore.get(number);
                countStore.put(number, ++value);
            }else {
                countStore.put(number, 1);
            }
        }
        for (int key : countStore.keySet()) {
            int value = countStore.get(key);
            if (value > 1) {
                return true;
            }
        }
        return false;
    }
}
