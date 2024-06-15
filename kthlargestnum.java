

class kthlargestnum {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> {
            // Custom comparator to compare strings as integers
            if (a.length() != b.length()) {
                return a.length() - b.length(); // shorter strings are "larger" in terms of kth largest
            }
            return a.compareTo(b); // lexicographical comparison for strings of same length
        });
        
        // Add numbers to the max heap
        for (String num : nums) {
            maxHeap.offer(num);
            // Maintain the size of the heap to k
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the smallest element (root of max heap)
            }
        }
        
        // The kth largest number will be the root of the max heap
        return maxHeap.poll();
    }
    
    
}