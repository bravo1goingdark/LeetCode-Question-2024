import java.util.Arrays;
import java.util.HashMap;

public class relativesort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = countMap(arr1);
        int[] ans = new int[arr1.length];
        int index = 0;

        for (int value : arr2) {
            int getCount = map.get(value);
            for (int i = 0; i < getCount; i++) {
                ans[index++] = value;
            }
            map.remove(value);
        }

        int[] remainingElements = new int[arr1.length - index];
        int remainingIndex = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);
            for (int i = 0; i < count; i++) {
                remainingElements[remainingIndex++] = key;
            }
        }

        Arrays.sort(remainingElements);
        for (int value : remainingElements) {
            ans[index++] = value;
        }

        return ans;
    }

    public static HashMap<Integer, Integer> countMap(int[] nums) {
        HashMap<Integer, Integer> countStore = new HashMap<>(nums.length);

        for (int number : nums) {
            countStore.put(number, countStore.getOrDefault(number, 0) + 1);
        }
        return countStore;
    }
}
