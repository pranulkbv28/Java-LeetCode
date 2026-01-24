public class RunningSumOfOneDArray {
    public static int[] runningSum(int[] nums) {
        int answer[] = new int[nums.length];
        answer[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };

        int answer[] = runningSum(nums);

        for (int num : answer) {
            System.out.println(num);
        }
    }
}
