public class heightchecker {
    public int heightChecker(int[] heights) {
        int[] expected = countSort(heights);;
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
    public int[] countSort(int[] arr){
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i-1];
        }
        int[] sortedArray = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            sortedArray[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return sortedArray;

    }
    public void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
