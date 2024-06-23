import java.util.PriorityQueue;

public class longestsubarr {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            maxHeap.offer(nums[right]);
            minHeap.offer(nums[right]);

            while (maxHeap.peek() - minHeap.peek() > limit) {
                minHeap.remove(nums[left]);
                maxHeap.remove(nums[left]);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;        
    }

    
}
