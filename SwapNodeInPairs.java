public class SwapNodeInPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;

            first.next = second.next;
            second.next = first;
            curr.next = second;

            curr = first;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head1 = new ListNode(1, node1);

        System.out.println(swapPairs(head1));
    }
}
