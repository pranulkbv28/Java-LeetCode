public class ValidPallindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean pallindrome = false;

        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(s.length() - 1 - i) == 0) {
                pallindrome = true;
            } else {
                return false;
            }
        }

        return pallindrome;
    }

    public static void main(String[] args) {

    }
}
