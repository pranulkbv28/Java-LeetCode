public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        while (n1 > 0 && n2 > 0) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
            n1--;
            n2--;
        }
        while (n1 > 0) {
            sb.append(word1.charAt(i));
            i++;
            n1--;
        }
        while (n2 > 0) {
            sb.append(word2.charAt(i));
            i++;
            n2--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
