class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IncreasingOrderSearchTree {

    static TreeNode current;

    public static TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        current = dummy;

        inorder(root);

        return dummy.right;
    }

    private static void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);

        node.left = null; // remove left child
        current.right = node; // link previous node to current
        current = node; // move pointer forward

        inorder(node.right);
    }
}
