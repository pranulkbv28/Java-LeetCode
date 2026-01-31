import java.util.Stack;

public class MaximumTwinSumOfALinkedList {
    public static int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode node = head;
        int count = 0;
        while (node != null) {
            stack.push(node.val);
            node = node.next;

            count++;
        }

        int i = 0;
        node = head;
        int max = Integer.MIN_VALUE;
        while (i < count / 2) {
            max = Integer.max(max, stack.pop() + node.val);
            node = node.next;
            i++;
        }

        return max;
    }
}
