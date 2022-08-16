package problems.easy;

import java.util.*;

public class RemoveDuplicatesFromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        SortedSet<Integer> integerSortedSet = convertListNodeToSortedSet(head);
        return convertCollectionToListNode(integerSortedSet);
    }

    public SortedSet<Integer> convertListNodeToSortedSet(ListNode head) {
        //given the head of ListNodes, returns the equivalent LinkedList
        SortedSet<Integer> integerSortedSet = new TreeSet<>();
        while (head != null) {
            integerSortedSet.add(head.val);
            head = head.next;
        }

        return integerSortedSet;
    }

    public ListNode convertCollectionToListNode(Collection<Integer> c) {
        //given the collection, returns the equivalent ListNode head
        int count = 0;
        ListNode head = new ListNode();
        ListNode node = head;
        for (int val: c) {
            if (count < c.size() - 1) {
                node.next = new ListNode();
            }
            node.val = val;
            node = node.next;
            count++;
        }

        return head;
    }
}


class ListNode {
    int val;
   ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
