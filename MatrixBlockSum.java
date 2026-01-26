public class MatrixBlockSum {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            int rowLowLimit = 0;
            int rowHighLimit = 0;
            int columnLowLimit = 0;
            int columnHighLimit = 0;

            for (int j = 0; j < n; j++) {
                rowLowLimit = i - k <= 0 ? 0 : i - k;
                rowHighLimit = i + k >= m ? m - 1 : i + k;

                columnLowLimit = j - k <= 0 ? 0 : j - k;
                columnHighLimit = j + k >= n ? n - 1 : j + k;

                ans[i][j] = sum(mat, rowLowLimit, rowHighLimit, columnLowLimit, columnHighLimit);
            }
        }

        return ans;
    }

    public static int sum(int[][] mat, int rowStart, int rowEnd, int colStart, int colEnd) {
        int sum = 0;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                sum += mat[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = { { 67, 64, 78 }, { 99, 98, 38 }, { 82, 46, 46 }, { 6, 52, 55 }, { 55, 99, 45 } };
        int k = 3;

        int ans[][] = matrixBlockSum(mat, k);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
