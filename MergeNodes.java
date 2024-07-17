class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode iterator = head.next; // Start after the first 0
        int sum = 0;

        while (iterator != null) {
            if (iterator.val == 0) {
                // Encountering a 0 means we finished summing the previous segment
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0; // Reset sum for the next segment
            } else {
                // Add the current value to the sum
                sum += iterator.val;
            }
            iterator = iterator.next;
        }

        return dummy.next; // The head of the new list
    }
}
