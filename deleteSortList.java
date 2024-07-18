import java.util.HashMap;
import java.util.Map;

public class deleteSortList {
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> getmapNode = getMap(head);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (getmapNode.get(current.val) > 1) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return dummy.next;
    }

    private Map<Integer, Integer> getMap(ListNode head) {
        Map<Integer, Integer> countMap = new HashMap<>();

        ListNode temp = head;

        while (temp != null) {
            countMap.put(temp.val, countMap.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        return countMap;
    }
}