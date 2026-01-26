public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n * 2];
        int i = 0;
        int j = n;

        for (int k = 0; k < ans.length && i < n;) {
            ans[k] = nums[i++];
            k++;
            if (i + 1 <= ans.length) {
                ans[k] = nums[j++];
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7 };
        int n = 1;

        int[] ans = shuffle(nums, n);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}
