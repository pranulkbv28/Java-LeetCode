class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicatesFromSortedListTwo {
    public static ListNode deleteDuplicates(ListNode head) {

        // Dummy node to handle cases where head itself is removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy; // last confirmed unique node
        ListNode curr = head;

        while (curr != null) {
            // Check if current value is duplicated
            boolean isDuplicate = false;

            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                // Skip all duplicates
                prev.next = curr.next;
            } else {
                // Current value is unique
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode root = new ListNode(1, node2);

        root = deleteDuplicates(root);
    }
}
