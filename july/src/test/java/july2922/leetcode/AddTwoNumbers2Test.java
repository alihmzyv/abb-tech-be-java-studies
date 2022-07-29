package july2922.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers2Test {

    @Test
    void addTwoNumbers() {
    }

    @Test
    void listNodesToInt() {
        ListNode ln = new ListNode(9);
        ListNode ln2 = new ListNode(1);
        ListNode ln2FirstNode = ln2;


        for (int i = 0; i < 9; i++) {
            ln2.next = new ListNode(9);
            ln2 = ln2.next;
        }

        ListNode result = AddTwoNumbers2.intToListNodes(AddTwoNumbers2.listNodesToInt(ln2FirstNode) + AddTwoNumbers2.listNodesToInt(ln));

        assertEquals(10_000_000_000L, AddTwoNumbers2.listNodesToInt(result));
    }

    @Test
    void intToListNodes() {
    }
}