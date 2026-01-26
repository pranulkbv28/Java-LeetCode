public class NumbersSmallerThanCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 1, 2, 2, 3 };

        int ans[] = smallerNumbersThanCurrent(nums);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}
