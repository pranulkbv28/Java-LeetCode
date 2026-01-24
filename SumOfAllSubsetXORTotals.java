public class SumOfAllSubsetXORTotals {
    public static int subsetXORSum(int[] nums) {
        int or = 0;

        for (int num : nums) {
            or |= num;
        }

        int n = nums.length;
        return or * (1 << (n - 1));
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 3 };

        System.out.println(subsetXORSum(nums));
    }
}
