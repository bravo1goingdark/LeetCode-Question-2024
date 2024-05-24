public class insertpos {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,4,5,6},6));       
    }
    public static int searchInsert(int[] nums, int target) {
        if (binarySearch(nums, target) == -1) {
            return maxIndex(nums, target);
        }
        return binarySearch(nums, target);
    }
    private static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;

    }
    private static int maxIndex(int[] nums ,int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i ;
            }
        }
        return nums.length;
    }
    
}
