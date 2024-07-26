public class countMaxOr {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        return count(0, nums, 0, maxOr);
    }

    private int count(int index, int[] arr, int currentOr, int maxOr) {
        if (index == arr.length) {
            return currentOr == maxOr ? 1 : 0;
        }

        int countWithCurrent = count(index + 1, arr, currentOr | arr[index], maxOr);

        int countWithoutCurrent = count(index + 1, arr, currentOr, maxOr);

        return countWithCurrent + countWithoutCurrent;
    }
}