public class maxXOR {
    public static void main(String[] args) {
        System.out.println(maximumStrongPairXor(new int[]{1,2,3,4,5}));
    }
    public static int maximumStrongPairXor(int[] nums) {

        int xorMax = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int x = nums[i];
                int y = nums[j];
                if (Math.abs(x-y) <= Math.min(x,y)) {
                    xorMax = Math.max(xorMax, x ^ y);
                }
            }
        }
        return xorMax;
    }
}