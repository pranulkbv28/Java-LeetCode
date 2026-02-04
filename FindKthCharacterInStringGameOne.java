public class FindKthCharacterInStringGameOne {
    public static char kthCharacter(int k) {
        return solve(k);
    }

    private static char solve(int k) {
        if (k == 1) {
            return 'a';
        }
        int len = 1;
        while (len < k) {
            len *= 2;
        }

        int half = len / 2;

        if (k <= half) {
            return solve(k);
        } else {
            return nextChar(solve(k - half));
        }
    }

    private static char nextChar(char c) {
        return c == 'z' ? 'a' : (char) (c + 1);
    }
}