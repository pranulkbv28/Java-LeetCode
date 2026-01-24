public class MaximumWordsInASentence {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String str : sentences) {
            max = Math.max(max, str.split(" ").length);
        }

        return max;
    }

    public static void main(String[] args) {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

        System.out.println(mostWordsFound(sentences));
    }
}
