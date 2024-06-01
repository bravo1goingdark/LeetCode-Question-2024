public class squareSortArray {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int first = 0;
        int last = nums.length - 1;
        int indexTrack = nums.length - 1;

        while (first <= last) {
            if (Math.abs(nums[first]) > Math.abs(nums[last])) {
                res[indexTrack--] = nums[first] * nums[first];
                first++;
            } else {
                res[indexTrack--] = nums[last] * nums[last];
                last--;
            }
        }
        return res;
    }
}
