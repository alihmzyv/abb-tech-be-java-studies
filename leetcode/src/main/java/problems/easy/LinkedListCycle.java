package problems.easy;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodeSet = new HashSet<>();

        while(head != null) {
            if (listNodeSet.contains(head)) {
                return true;
            }
            listNodeSet.add(head);
            head = head.next;
        }

        return false;
    }
}



