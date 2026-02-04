import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}
