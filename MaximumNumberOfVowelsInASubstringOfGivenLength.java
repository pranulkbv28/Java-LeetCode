public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        // Count vowels in first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "weallloveyou";
        int k = 7;

        System.out.println(maxVowels(s, k));
    }
}
