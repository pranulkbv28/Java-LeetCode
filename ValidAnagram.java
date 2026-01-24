import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
