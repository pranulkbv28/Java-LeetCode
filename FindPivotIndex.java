public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && sum(nums, i + 1, nums.length) == 0) {
                return 0;
            } else if (i == nums.length - 1 && sum(nums, 0, nums.length - 1) == 0) {
                return i;
            }

            if (sum(nums, 0, i) == sum(nums, i + 1, nums.length)) {
                return i;
            }
        }

        return -1;
    }

    public static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };

        System.out.println(pivotIndex(nums));
    }
}
