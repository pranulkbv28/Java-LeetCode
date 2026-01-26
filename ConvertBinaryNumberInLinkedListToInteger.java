public class ConvertBinaryNumberInLinkedListToInteger {
    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        ListNode node = head;

        while (node != null) {
            sb.append(node.val);
            node = node.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
