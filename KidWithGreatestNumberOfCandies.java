import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);

        // Find the maximum candies any kid currently has
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Check if each kid can have >= max after adding extraCandies
        for (int candy : candies) {
            answer.add(candy + extraCandies >= max);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        List<Boolean> answer = kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}
