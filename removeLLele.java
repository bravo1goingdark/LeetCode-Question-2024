class removeLLele {
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the list is empty
        if (head == null) {
            return null;
        }

        // Create a dummy node to serve as the new head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers for traversal
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                // Skip the node with the given value
                prev.next = current.next;
            } else {
                // Move to the next node
                prev = current;
            }
            current = current.next;
        }

        // Return the new head (after skipping nodes with the given value)
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}