import java.util.Arrays;

public class houserobII {
    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1, -1);
        int maxRob1 = robHelper(0, nums, nums.length - 1, dp1);


        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        int maxRob2 = robHelper(1, nums, nums.length, dp2);

        return Math.max(maxRob1, maxRob2);
    }

    private static int robHelper(int start, int[] nums, int end, int[] dp) {
        if (start >= end) {
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }

        int robOne = nums[start] + robHelper(start + 2, nums, end, dp);
        int skipOne = robHelper(start + 1, nums, end, dp);

        dp[start] = Math.max(robOne, skipOne);
        return dp[start];
    }
}
