import java.util.TreeMap;

public class DivideArrayIntoEqualPairs {
    public static boolean divideArray(int[] nums) {
        TreeMap<Integer, Integer> map1 = new TreeMap<>();

        for (int num : nums) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int value : map1.values()) {
            if (value % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 4, 3, 2 };

        System.out.println(divideArray(nums));
    }
}
