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

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 1. Find length and tail
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 2. Reduce k
        k = k % length;
        if (k == 0) {
            return head;
        }

        // 3. Find new tail: (length - k - 1)th node
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }

        // 4. Rewire pointers
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}
