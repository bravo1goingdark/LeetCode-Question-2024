public class leftRightDifference {
        public int[] leftRightdifference(int[] nums) {
            int n = nums.length;
            int[] prefixSum = new int[n];
            int[] suffixSum = new int[n];
            int[] answer = new int[n];
            
            // Calculate prefix sum
            prefixSum[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
            
            // Calculate suffix sum
            suffixSum[n - 1] = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suffixSum[i] = suffixSum[i + 1] + nums[i];
            }
            
            // Calculate leftSum, rightSum, and answer
            for (int i = 0; i < n; i++) {
                int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
                int rightSum = (i == n - 1) ? 0 : suffixSum[i + 1];
                answer[i] = Math.abs(leftSum - rightSum);
            }
            
            return answer;
        }
    
}
