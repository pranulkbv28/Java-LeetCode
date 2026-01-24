import java.math.BigInteger;

public class AddTwoNumberTwo {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l2.val == 0) {
            return l1;
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        ListNode node1 = l1;
        ListNode node2 = l2;

        while (node1 != null) {
            sb1.append(node1.val);
            node1 = node1.next;
        }
        while (node2 != null) {
            sb2.append(node2.val);
            node2 = node2.next;
        }

        BigInteger n1 = new BigInteger(sb1.toString());
        BigInteger n2 = new BigInteger(sb2.toString());

        String sum = n1.add(n2).toString();

        int i = 0;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (i < sum.length()) {
            ListNode newNode = new ListNode(sum.charAt(i) - '0');
            curr.next = newNode;

            curr = curr.next;
            i++;
        }

        return dummy.next;
    }
}
