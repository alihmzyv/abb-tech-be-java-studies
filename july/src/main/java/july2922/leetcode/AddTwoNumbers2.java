package july2922.leetcode;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //calculate num1 and num2
        long num1 = listNodesToInt(l1);
        long num2 = listNodesToInt(l2);

        //sum two numbers
        //code sum into ListNodes
        return intToListNodes(num1 + num2);
    }

    public static long listNodesToInt(ListNode ln) {
        StringBuilder sb = new StringBuilder();

        while (ln != null) {
            sb.insert(0, ln.val);
            ln = ln.next;
        }

        return Long.parseLong(sb.toString());
    }

    public static ListNode intToListNodes (long num) {
        ListNode lnResult = new ListNode((int) num % 10, new ListNode()); //first node
        num /= 10;

        ListNode ln = lnResult; //refer to use below
        while(num > 0) {
            ln.next = new ListNode((int) num % 10, new ListNode());
            num /= 10;
            ln = ln.next;
        }
        ln.next = null;

        return lnResult;
    }
}

class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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