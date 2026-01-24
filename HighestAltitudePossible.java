public class HighestAltitudePossible {
    public static int largestAltitude(int[] gain) {
        int highest = 0;
        int alt = gain[0];
        highest = Math.max(highest, alt);

        for (int i = 1; i < gain.length; i++) {
            alt += gain[i];
            highest = Math.max(highest, alt);
        }

        return highest;
    }

    public static void main(String[] args) {
        int gain[] = { 52, -91, 72 };

        System.out.println(largestAltitude(gain));
    }
}
