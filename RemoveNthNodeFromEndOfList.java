public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n == 1)) {
            return null;
        }

        int size = 0;
        ListNode node = head;

        while (node != null && node.next != null) {
            size++;
            node = node.next;
        }
        size++;

        node = head;
        int pos = size - n;

        if (pos == 0) {
            return head.next;
        }

        while (node != null && node.next != null && pos >= 0) {
            pos--;

            if (pos == 0) {
                node.next = node.next.next;
                break;
            }

            node = node.next;
        }

        return head;

    }
}
