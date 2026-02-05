public class GetPow {
    public static double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            x = 1.0 / x;
            exp = -exp;
        }
        return powRec(x, exp);
    }

    private static double powRec(double x, long exp) {
        if (exp == 0)
            return 1.0;
        double half = powRec(x, exp / 2);
        if ((exp & 1L) == 0L)
            return half * half;
        return half * half * x;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -200000000;

        System.out.println(myPow(x, n));
    }
}
