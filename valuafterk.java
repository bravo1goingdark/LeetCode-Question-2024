import java.util.Arrays;

public class valuafterk {
    public int valueAfterKSeconds(int n, int k) {
        final int MOD = 1000000007;
        int[] a = new int[n];
    
        // Initialize array with 1s
        for (int i = 0; i < n; i++) {
            a[i] = 1;
        }
    
        // Perform updates for k seconds
        for (int sec = 0; sec < k; sec++) {
            // Use a prefix sum to update the array
            int[] prefixSum = new int[n];
            prefixSum[0] = a[0];
            
            for (int i = 1; i < n; i++) {
                prefixSum[i] = (prefixSum[i - 1] + a[i]) % MOD;
            }
            
            // Update the array using the prefix sums
            for (int i = 0; i < n; i++) {
                a[i] = prefixSum[i];
            }
        }
    
        return a[n - 1];
    }
}
