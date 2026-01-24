public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int[] count = new int[26]; // For 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        count[t.charAt(t.length() - 1) - 'a']--;

        int i = 0;
        for (int c : count) {
            if (c != 0) {
                return (char) (i + 'a');
            }
            i++;
        }

        return ' ';
    }

    public static void main(String[] args) {
        String s = "", t = "y";
        System.out.println(findTheDifference(s, t));
    }
}
