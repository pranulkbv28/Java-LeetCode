public class ConstructBinarySearchTreeFromPreorderTraversal {
    public static TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, new int[] { 0 }, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static TreeNode build(int[] preorder, int[] idx, int low, int high) {
        if (idx[0] >= preorder.length)
            return null;
        int val = preorder[idx[0]];
        if (val < low || val > high)
            return null;

        idx[0]++;
        TreeNode node = new TreeNode(val);
        node.left = build(preorder, idx, low, val - 1);
        node.right = build(preorder, idx, val + 1, high);
        return node;
    }
}
