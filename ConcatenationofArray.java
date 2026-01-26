public class ConcatenationofArray {
    public static int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length * 2];

        int i = 0;
        while (i < nums.length) {
            answer[i] = nums[i];
            i++;
        }

        int j = i;
        i = 0;
        while (i < nums.length && j < answer.length) {
            answer[j] = nums[i];
            j++;
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int[] answer = getConcatenation(nums);

        for (int num : answer) {
            System.out.println(num);
        }
    }
}
