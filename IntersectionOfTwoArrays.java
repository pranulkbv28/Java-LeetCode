import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2); // Sort one array for binary search
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                result.add(num); // Use set to avoid duplicates
            }
        }

        // Convert set to int array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

    private static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
