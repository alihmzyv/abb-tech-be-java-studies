package august122.leetcode;

import august122.leetcode.ListNode;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln = new ListNode();
        ListNode head = ln; //to be returned
        int length1 = getLengthOfLinkedList(list1);
        int length2 = getLengthOfLinkedList(list2);
        int lengthSum = length1 + length2; //to be iterated through

        if (list1 == null && list2 != null) {
            head = list2;
        }
        else if(list2 == null && list1 != null) {
            head = list1;
        }
        else if (list2 == null && list1 == null) {
            head = null;
        }
        else { //both are non-null


            for (int i = 0; i < lengthSum; i++) {

                if (list1 == null && list2 != null) {
                    ln = list2;
                    return head;
                }
                else if(list2 == null && list2 != null) {
                    ln = list1;
                    return head;
                }
                else if (list1 == list2 && list1 == null) {
                    return head;
                }

                if (list1.val > list2.val) {
                    ln.val = list2.val;
                    list2 = list2.next;
                }
                else if (list2.val > list1.val) {
                    ln.val = list1.val;
                    list1 = list1.next;
                }
                else {//both has equal values
                    ln.val = list1.val;
                    ln.next = new ListNode(list1.val);

                    list1 = list1.next;
                    list2 = list2.next;

                    ln = ln.next;
                }
                ln.next = new ListNode();
                ln = ln.next;
            }

            ln = null; //remove the empty node from the last iteration

        }

        return head;
    }

    public static int getLengthOfLinkedList(ListNode head) {
        //given the head of linked list, returns the length of list
        int length = 0;
        ListNode ln = head;
        while (ln != null) {
            length++;
            ln = ln.next;
        }

        return length;
    }
}
