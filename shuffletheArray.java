public class shuffletheArray {
    public static void main(String[] args) {
        System.out.println((int) 'a');
    }
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledarr = new int[nums.length];
        int start = 0;
        int end = n;
        int index = 0;
        while (start < n) {
            shuffledarr[index++] = nums[start];
            shuffledarr[index++] = nums[end];
            start++;
            end++;
        }
        return shuffledarr;
    }
}
