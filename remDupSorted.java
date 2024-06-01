
public class remDupSorted {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int index = 1; // Index to place the next unique element
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i]; // Move the unique element to the next available index
            }
        }
        return index;
    }
}
