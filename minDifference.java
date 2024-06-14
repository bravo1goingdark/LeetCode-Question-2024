import java.util.Arrays;

public class minDifference {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{9,4,1,7}, 2));
    }
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums); 

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i]; 
            minDiff = Math.min(minDiff, diff); 
        }

        return minDiff;
    }
}
