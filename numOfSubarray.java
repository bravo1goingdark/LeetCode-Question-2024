public class numOfSubarray {
    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = k - 1;
        int sum = 0;
        int count = 0;
   
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }
    
        while (right < arr.length) {
            if (sum / k >= threshold) {
                count++;
            }
            left++;
            right++;
    
            if (right < arr.length) {
                sum = sum - arr[left - 1] + arr[right];
            }
        }
        return count;
    }
}
