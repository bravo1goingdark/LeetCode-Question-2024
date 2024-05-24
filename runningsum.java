public class runningsum {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        int i = 1;
        while (i < nums.length) {
            runningSum[i] = runningSum[i - 1] + nums[i];
            i++;
        }
        return runningSum;
    }
}
