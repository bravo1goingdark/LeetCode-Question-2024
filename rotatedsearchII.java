public class rotatedsearchII {
    public boolean search(int[] nums, int target) {
        return searchRotatedArr(nums ,target , 0 , nums.length - 1);
    }
    public boolean searchRotatedArr(int[] arr , int target , int start , int end){
        if (start > end) {
            return false;
        }
        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return true;
        }
        // handles duplicatekk
        if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            boolean leftResult = searchRotatedArr(arr, target, start, mid - 1);
            if (leftResult != false) {
               return leftResult;
            }
            return searchRotatedArr(arr, target, mid + 1, end);
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return searchRotatedArr(arr, target, start, mid - 1);
            }else {
                return searchRotatedArr(arr, target, mid + 1, end);

            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return searchRotatedArr(arr, target, mid + 1, end);
        }
        return searchRotatedArr(arr, target, start, mid - 1);
    }
}
