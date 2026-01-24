import java.util.HashSet;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        HashSet<String> uniqueTransformations = new HashSet<>();

        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char letter : word.toCharArray()) {
                morse.append(morseCode[letter - 'a']);
            }
            uniqueTransformations.add(morse.toString());
        }

        return uniqueTransformations.size();
    }

    public static void main(String[] args) {
        String[] words = { "rwjje", "aittjje", "auyyn", "lqtktn", "lmjwn" };

        System.out.println(uniqueMorseRepresentations(words));
    }
}
