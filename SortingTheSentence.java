public class SortingTheSentence {
    public static String sortSentence(String s) {
        String[] strArr = new String[s.split(" ").length];

        for (String str : s.split(" ")) {
            strArr[(str.charAt(str.length() - 1) - '0') - 1] = str.substring(0, str.length() - 1);
        }

        return String.join(" ", strArr);
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
