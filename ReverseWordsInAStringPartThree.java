public class ReverseWordsInAStringPartThree {
    public static String reverseWords(String s) {
        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = new StringBuilder(strArr[i]).reverse().toString();
        }

        return String.join(" ", strArr);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
