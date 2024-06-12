class NumArray {
    int[] prefixArr;

    public NumArray(int[] nums) {
        prefixArr = new int[nums.length + 1]; 
        prefixArr[0] = 0; 
        for (int index = 1; index <= nums.length; index++) {
            prefixArr[index] = prefixArr[index - 1] + nums[index - 1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixArr[right + 1] - prefixArr[left];
    }
}