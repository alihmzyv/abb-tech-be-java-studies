package august122.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lengthOfLinkedList = getLengthOfLinkedList(head); //length of linked list

        if (lengthOfLinkedList == n) { //if the head is required to be removed
            head = head.next; //the second node is the head now (in case of length of 1, head is null now)
            return head;
        }


        ListNode ln = head;
        //iterate through linked list till the node which is located in a position one before the one to be removed
        for (int i = 1; i < lengthOfLinkedList - n; i++) {
            ln = ln.next;
        }

        ln.next = ln.next.next; //connect the node to the node coming after the one to be removed which means removing the node

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

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
