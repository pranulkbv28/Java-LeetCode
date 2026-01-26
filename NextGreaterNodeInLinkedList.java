public class NextGreaterNodeInLinkedList {
    public static int[] nextLargerNodes(ListNode head) {
        ListNode node = head;
        int index = 0;
        while (node != null) {
            index++;
            node = node.next;
        }

        int ans[] = new int[index];
        node = head;

        index = 0;
        while (node != null) {
            ans[index] = nextGreaterNodeValue(node, node.val);

            index++;
            node = node.next;
        }

        return ans;
    }

    public static int nextGreaterNodeValue(ListNode node, int value) {
        while (node != null) {
            if (node.val > value) {
                return node.val;
            }
            node = node.next;
        }

        return 0;
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(5);
        ListNode node1 = new ListNode(1, node2);
        ListNode head1 = new ListNode(2, node1);

        System.out.println(nextLargerNodes(head1));
    }
}
