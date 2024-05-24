import java.util.HashSet;

public class findsumSubarray {
    public boolean findSubarrays(int[] nums) {
    HashSet<Integer> sumSet = new HashSet<>();
    for (int i = 0; i < nums.length - 1; i++) {
        int sum = nums[i] + nums[i + 1];
        if (sumSet.contains(sum)) {
            return true;
        }
        sumSet.add(sum);
    }
    return false;
}
}
