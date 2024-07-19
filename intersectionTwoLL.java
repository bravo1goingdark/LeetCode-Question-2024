import java.util.HashSet;
import java.util.Set;

public class intersectionTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode firstList = headA;
        ListNode secondList = headB;

        while (firstList != null) {
            set.add(firstList);
            firstList = firstList.next;
        }

        while (secondList != null) {
            if (set.contains(secondList)) {
                return secondList;
            }
            secondList = secondList.next;
        }
        return null;
    }
    // BETTER SOLUTION
    public ListNode getIntersectionNodeBetterSoln(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode a = headA;
        ListNode b = headB;
        
        // Traverse both lists. When one list ends, switch to the other list's head.
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        
        // Either a and b meet at the intersection node or they meet at null (no intersection).
        return a;
    }
}
