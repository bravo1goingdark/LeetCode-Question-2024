public class subsetXor {
    public int subsetXORSum(int[] nums) {
        return subset(0, nums, 0);
    }

    private int subset(int index, int[] arr, int xor) {
        if (index == arr.length) {
            return xor;
        }

        int include = subset(index + 1, arr, xor ^ arr[index]);
        int exclude =  subset(index + 1, arr, xor);

        return include + exclude;
    }
}
