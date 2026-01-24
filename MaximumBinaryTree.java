
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

public class MaximumBinaryTree {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildLeft(nums, 0, nums.length - 1);
    }

    public static TreeNode buildLeft(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int maxIndex = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = buildLeft(nums, left, maxIndex - 1);
        root.right = buildLeft(nums, maxIndex + 1, right);

        return root;
    }
}
