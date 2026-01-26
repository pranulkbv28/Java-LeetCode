public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            if (isSubstringDistinct(s.charAt(i - 1), s.charAt(i), s.charAt(i + 1))) {
                count++;
            }
        }

        return count;
    }

    public static boolean isSubstringDistinct(char charLeft, char charMid, char charRight) {
        return charLeft != charMid && charLeft != charRight && charMid != charRight;
    }

    public static void main(String[] args) {
        String s = "aababcabc";

        System.out.println(countGoodSubstrings(s));
    }
}
