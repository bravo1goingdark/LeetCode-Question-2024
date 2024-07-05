import java.util.ArrayList;
import java.util.List;

public class minMaxNodeVal {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null) {
            return new int[]{-1, -1};
        }
        
        List<Integer> criticalPoints = new ArrayList<>();
        
        // Traverse the list to find all critical points
        ListNode prev = head;
        ListNode current = head.next;
        int index = 1; // Start from the second node (index 1)
        
        while (current != null && current.next != null) {
            if ((prev.val < current.val && current.val > current.next.val) || 
                (prev.val > current.val && current.val < current.next.val)) {
                // Found a critical point
                criticalPoints.add(index);
            }
            prev = prev.next;
            current = current.next;
            index++;
        }
        
        // If fewer than two critical points found, return [-1, -1]
        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }
        
        // Calculate minDistance and maxDistance
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        
        for (int i = 1; i < criticalPoints.size(); i++) {
            int distance = criticalPoints.get(i) - criticalPoints.get(i - 1);
            minDistance = Math.min(minDistance, distance);
            maxDistance = Math.max(maxDistance, distance);
        }
        
        return new int[]{minDistance, maxDistance};
    }
}
