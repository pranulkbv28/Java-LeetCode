public class NumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char letter : word.toCharArray()) {
                if (allowed.indexOf(letter) == -1) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };

        System.out.println(countConsistentStrings(allowed, words));
    }
}
