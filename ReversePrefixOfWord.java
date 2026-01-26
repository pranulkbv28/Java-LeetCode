public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                reverse(chars, 0, i);
                return new String(chars);
            }
        }

        return new String(chars);
    }

    public static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }
}
