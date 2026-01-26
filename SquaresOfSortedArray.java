public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1; // position to fill in result (from end)

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };

        int[] ans = sortedSquares(nums);

        for (int num : ans) {
            System.out.println(num);
        }
    }

}
