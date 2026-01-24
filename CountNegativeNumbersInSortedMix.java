public class CountNegativeNumbersInSortedMix {
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] < 0) {
                count += grid[i].length;
            } else if (grid[i][grid[i].length - 1] >= 0) {
                count += 0;
            } else {
                int firstNegativeIndex = lowerBound(grid[i], 0);
                if (firstNegativeIndex == 0) {
                    firstNegativeIndex = grid[i].length;
                }
                count += (grid[i].length - firstNegativeIndex);
            }
        }

        return count;
    }

    public static int lowerBound(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[][] grid = { { 8, -2, -2, -2, -4, -5, -5 }, { -2, -3, -3, -4, -4, -5, -5 } };

        System.out.println(countNegatives(grid));
    }
}
