public class ProjectionAreaOfThreeDimensionalShapes {
    public static int projectionArea(int[][] grid) {
        int nonZeroCount = 0;
        int frontCount = 0;
        int sideCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    nonZeroCount++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, grid[i][j]);
            }
            frontCount += max;
        }

        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sideCount += max;
        }

        return nonZeroCount + frontCount + sideCount;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 2 }, { 3, 4 } };

        System.out.println(projectionArea(grid));
    }
}
