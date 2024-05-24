import java.util.HashMap;

class goodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,4}));
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> countStore = new HashMap<>(nums.length);
        int goodPairs = 0;
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
            if (value >= 2) {
                goodPairs += (value * (value - 1)) / 2;
            }
        }
        return goodPairs;
    }
}