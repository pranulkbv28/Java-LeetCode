public class MaximumXOR {
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];

        int mask = (1 << maximumBit) - 1;
        int totalXOR = 0;

        for (int num : nums) {
            totalXOR ^= num;
        }

        for (int i = 0; i < n; i++) {
            ans[i] = totalXOR ^ mask;
            totalXOR ^= nums[n - 1 - i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 5, 7 };
        int maximumBit = 3;

        int answer[] = getMaximumXor(nums, maximumBit);

        for (int num : answer) {
            System.out.println(num);
        }
    }
}
