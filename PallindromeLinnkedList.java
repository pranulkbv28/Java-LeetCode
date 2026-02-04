public class PallindromeLinnkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // Find middle (slow)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode second = reverse(slow);

        // Compare halves
        ListNode p1 = head, p2 = second;
        boolean ok = true;
        while (p2 != null) {
            if (p1.val != p2.val) {
                ok = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: restore list
        reverse(second);

        return ok;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
