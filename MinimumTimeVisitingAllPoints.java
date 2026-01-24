public class MinimumTimeVisitingAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;

        for (int i = 1; i < points.length; i++) {
            int xAxisDistance = Math.abs(points[i][0] - points[i - 1][0]);
            int yAxisDistance = Math.abs(points[i][1] - points[i - 1][1]);
            sum += Math.max(xAxisDistance, yAxisDistance);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };

        System.out.println(minTimeToVisitAllPoints(points));
    }
}
