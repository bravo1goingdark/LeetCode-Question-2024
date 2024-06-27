import java.util.Collections;
import java.util.List;

public class counttargetlesspair {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // Sort the list
        
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum < target) {
                count += right - left; // All pairs from left to right are valid
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }
        
        return count;
    }
}
