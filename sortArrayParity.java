public class sortArrayParity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (isEven(nums[start])) {
                start++;
            }else {
                swap(nums, start, end);
                end--;
            }
        }
        return nums;
    }
    public boolean isEven(int number){
        return number % 2 == 0;
    }
    public void swap(int[] arr,int firstIndex,int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    } 
}
