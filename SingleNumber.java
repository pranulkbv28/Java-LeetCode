import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }

        for (int ans : set) {
            return ans;
        }

        return -1;

    }

    public static void main(String[] args) {

    }
}
