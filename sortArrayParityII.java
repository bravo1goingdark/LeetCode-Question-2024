public class sortArrayParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;
        int length = nums.length;
    
        while (evenIndex < length && oddIndex < length) {
            if (isEven(nums[evenIndex])) {
                evenIndex += 2;
            } else if (!isEven(nums[oddIndex])) {
                oddIndex += 2;
            } else {
                swap(nums, evenIndex, oddIndex);
                evenIndex += 2;
                oddIndex += 2;
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
