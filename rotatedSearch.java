public class rotatedSearch {
    public int search(int[] nums, int target) {
        return searchRotatedArr(nums ,target , 0 , nums.length - 1);
    }
    public int searchRotatedArr(int[] arr , int target , int start , int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return mid;
        }
        // check if first half is sorted
        if (arr[start] <= arr[mid]) {
            // target is in left half
            if (target >= arr[start] && target <= arr[mid]) {
                return searchRotatedArr(arr, target, start, mid - 1);
            }else {
                return searchRotatedArr(arr, target, mid + 1, end);

            }
        }
        // otherwise the right half must be sorted
        if (target >= arr[mid] && target <= arr[end]) {
            return searchRotatedArr(arr, target, mid + 1, end);
        }
        return searchRotatedArr(arr, target, start, mid - 1);
    }
}
