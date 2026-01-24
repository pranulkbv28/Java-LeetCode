import java.util.HashMap;
import java.util.HashSet;

public class EqualCharOccurrences {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return new HashSet<>(map.values()).size() == 1;
    }

    public static void main(String[] args) {
        String s = "abacbc";

        System.out.println(areOccurrencesEqual(s));
    }
}
