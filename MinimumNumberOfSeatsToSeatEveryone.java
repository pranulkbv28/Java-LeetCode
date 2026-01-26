import java.util.Arrays;

public class MinimumNumberOfSeatsToSeatEveryone {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(students[i] - seats[i]);
        }

        return moves;
    }

    public static void main(String[] args) {
        int seats[] = { 4, 1, 5, 9 };
        int studenets[] = { 1, 3, 2, 6 };

        System.out.println(minMovesToSeat(seats, studenets));
    }
}
