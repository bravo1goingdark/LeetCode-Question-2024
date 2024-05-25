// contest

import java.util.HashMap;

public class bitwiseXor {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> countStore = new HashMap<>(nums.length);
        for (int number : nums) {
            if (countStore.containsKey(number)) {
                int value = countStore.get(number);
                countStore.put(number, ++value);
            }else {
                countStore.put(number, 1);
            }
        }
        int xorVal = 0;
        for (int key : countStore.keySet()) {
            int value = countStore.get(key);
            if (value > 1) {
                xorVal ^= key;
            }
        }
        return xorVal;
    }

}
