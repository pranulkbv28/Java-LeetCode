public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            flipImage(image[i]);
            invertImage(image[i]);
        }

        return image;
    }

    public static void flipImage(int[] row) {
        int left = 0;
        int right = row.length - 1;
        int temp = 0;
        while (left < right) {
            temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            right--;
            left++;
        }
    }

    public static void invertImage(int[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                row[i] = 0;
            } else {
                row[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int image[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        int answer[][] = flipAndInvertImage(image);

        for (int i = 0; i < answer.length; i++) {
            System.out.println();
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
        }
    }
}
