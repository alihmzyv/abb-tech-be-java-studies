package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> listNodeSet = new HashSet<>();
        while (headA != null || headB != null) {
            if (listNodeSet.contains(headA)) {
                return headA;
            }
            if (headA != null) {
                listNodeSet.add(headA);
                headA = headA.next;
            }
            if (listNodeSet.contains(headB)) {
                return headB;
            }
            if (headB != null) {
                listNodeSet.add(headB);
                headB = headB.next;
            }
        }
        return null;
    }
}
