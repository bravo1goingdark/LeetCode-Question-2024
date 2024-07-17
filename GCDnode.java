public class GCDnode {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            ListNode node = new ListNode(gcd(first.val, second.val));
            first.next = node;
            node.next = second;
            first = second;
            second = second.next;
        }

        return head;
    }
    public int gcd(int first , int second){
        if (second == 0) {
            return first;
        }

        return gcd(second, first % second);
    }
}
