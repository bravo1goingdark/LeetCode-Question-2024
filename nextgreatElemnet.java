public class nextgreatElemnet {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int index = 0; index < nums1.length; index++) {
            int elementIndex = findElementIndex(nums2, nums1[index]);
            int nextElement = getNextElement(nums2, elementIndex);
            if (nextElement != -1) {
                if (nextElement > nums1[index]) {
                    ans[index] = nextElement; 
                }
            }else {
                ans[index] = -1;
            }
        }
        return ans;
    }

    public int findElementIndex(int[] arr, int value){
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == value) {
                return index;
            }
        }
        return -1;
    }
    public int getNextElement(int[] arr, int index){
        int currentValue = arr[index];
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > currentValue) {
                return arr[i];
            }
        }
        return -1;
    }
}
