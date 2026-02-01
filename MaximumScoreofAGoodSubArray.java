public class MaximumScoreofAGoodSubArray {
    public static int maximumScore(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            minValue = Math.min(minValue, nums[i]);
            max = Math.max(max, (minValue * (i - 0 + 1)));
        }

        return max;
    }
}
