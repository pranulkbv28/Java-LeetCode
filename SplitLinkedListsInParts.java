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

public class SplitLinkedListsInParts {
    public static ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];

        // 1. Find total length of the list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // 2. Determine base size and extra nodes
        int baseSize = length / k; // minimum size of each part
        int extra = length % k; // first 'extra' parts get one more node

        curr = head;

        // 3. Split the list
        for (int i = 0; i < k; i++) {
            if (curr == null) {
                result[i] = null;
                continue;
            }

            result[i] = curr;

            int partSize = baseSize + (extra > 0 ? 1 : 0);
            extra--;

            // Move to the end of this part
            for (int j = 1; j < partSize; j++) {
                curr = curr.next;
            }

            // Cut the list
            ListNode nextPart = curr.next;
            curr.next = null;
            curr = nextPart;
        }

        return result;
    }
}
