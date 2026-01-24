public class DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (isVowel(s.charAt(i))) {
                sum1++;
            }
            if (isVowel(s.charAt((s.length() / 2) + i))) {
                sum2++;
            }
        }

        return sum1 == sum2;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}
