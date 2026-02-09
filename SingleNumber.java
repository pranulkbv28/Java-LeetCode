public class SingleNumber {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == nums.length - 1 && i == nums.length - 1) {
                    return nums[i];
                } else if (j == i) {
                    continue;
                } else if (nums[i] == nums[j]) {
                    break;
                } else if (j == nums.length - 1 && nums[i] != nums[j]) {
                    return nums[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));
    }
}
