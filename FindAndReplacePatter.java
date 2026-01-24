import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAndReplacePatter {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    public static boolean matches(String word, String pattern) {
        int[] pToW = new int[26];
        int[] wToP = new int[26];
        Arrays.fill(pToW, -1);
        Arrays.fill(wToP, -1);

        for (int i = 0; i < word.length(); i++) {
            int p = pattern.charAt(i) - 'a';
            int w = word.charAt(i) - 'a';

            if (pToW[p] == -1 && wToP[w] == -1) {
                pToW[p] = w;
                wToP[w] = p;
            } else if (pToW[p] != w || wToP[w] != p) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abc", "deq", "mee", "aqq", "dkd", "ccc" };
        String pattern = "abb";

        System.out.println(findAndReplacePattern(words, pattern));
    }
}
