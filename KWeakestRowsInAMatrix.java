import java.util.Arrays;

public class KWeakestRowsInAMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] strength = new int[m][2];

        // Step 1: count soldiers using binary search
        for (int i = 0; i < m; i++) {
            strength[i][0] = countSoldiers(mat[i]);
            strength[i][1] = i;
        }

        // Step 2: sort by soldiers, then index
        Arrays.sort(strength, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        // Step 3: collect first k rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = strength[i][1];
        }

        return result;
    }

    private static int countSoldiers(int[] row) {
        int left = 0;
        int right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };

        int k = 3;

        int ans[] = kWeakestRows(mat, k);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}
