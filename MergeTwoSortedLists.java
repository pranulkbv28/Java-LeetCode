public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null || list2 != null) {

            ListNode newNode = new ListNode();

            if (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    newNode.val = list2.val;
                    list2 = list2.next;
                } else {
                    newNode.val = list1.val;
                    list1 = list1.next;
                }
            } else {
                if (list1 == null && list2 != null) {
                    newNode.val = list2.val;
                    list2 = list2.next;
                }

                if (list2 == null && list1 != null) {
                    newNode.val = list1.val;
                    list1 = list1.next;
                }
            }

            curr.next = newNode;
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(4);
        ListNode node1 = new ListNode(2, node2);
        ListNode head1 = new ListNode(1, node1);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3, node3);
        ListNode head2 = new ListNode(1, node4);

        System.out.println(mergeTwoLists(head1, head2));
    }
}
