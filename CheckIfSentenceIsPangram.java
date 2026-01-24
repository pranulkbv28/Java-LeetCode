import java.util.HashSet;

public class CheckIfSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        HashSet<Character> set1 = new HashSet<>();

        for (char ch : sentence.toCharArray()) {
            set1.add(ch);
        }

        return set1.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));
    }
}
