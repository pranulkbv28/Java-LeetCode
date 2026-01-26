public class FirstPallindromicStringInArray {
    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (isPallindrome(words[i])) {
                return words[i];
            }
        }

        return "";
    }

    public static boolean isPallindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };

        System.out.println(firstPalindrome(words));
    }
}
