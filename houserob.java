import java.util.Arrays;

public class houserob {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp,-1);
        return rob(0, nums, dp);
    }
    private static int rob(int index,int[] arr,int[] dp){
        if (index >= arr.length) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }

        int robOne = arr[index] + rob(index + 2, arr, dp);
        int skipOne = rob(index + 1,arr,dp);

        return dp[index] =  Math.max(robOne, skipOne);
    }
}
