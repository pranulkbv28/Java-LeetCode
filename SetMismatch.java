public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        int duplicate = -1;
        int missing = -1;

        // Step 1: find duplicate
        for (int num : nums) {
            if (seen[num]) {
                duplicate = num;
            } else {
                seen[num] = true;
            }
        }

        // Step 2: find missing
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 1, 2, 4 };

        int[] ans = findErrorNums(nums);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}
