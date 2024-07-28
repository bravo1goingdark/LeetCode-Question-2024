
public class maxXXorQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int maxVal = (1 << maximumBit) - 1; 
        int prefixXOR = 0;
        int[] result = new int[n];
        
        for (int num : nums) {
            prefixXOR ^= num;
        }

        for (int i = 0; i < n; i++) {
            result[i] = maxVal ^ prefixXOR; 
            prefixXOR ^= nums[n - 1 - i];   
        }
        
        return result;
    }
}