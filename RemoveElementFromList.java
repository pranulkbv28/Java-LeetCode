public class RemoveElementFromList {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        while (newHead != null && newHead.val == val) {
            newHead = newHead.next;
        }

        if (newHead == null) {
            return null;
        }

        ListNode node = newHead;

        while (node != null && node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return newHead;
    }

}
