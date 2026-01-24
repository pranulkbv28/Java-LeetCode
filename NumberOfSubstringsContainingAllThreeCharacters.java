public class NumberOfSubstringsContainingAllThreeCharacters {
    public static int numberOfSubstrings(String s) {
        int[] freq = new int[3]; // a, b, c
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            // shrink window while valid
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
