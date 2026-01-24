import java.util.ArrayList;
import java.util.List;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        @SuppressWarnings("unchecked")
        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                buckets[freq[i]].add((char) i);
            }
        }

        for (int i = buckets.length - 1; i >= 0; i--) {
            for (char ch : buckets[i]) {
                sb.append(String.valueOf(ch).repeat(i));
            }
        }

        return sb.toString();

        // Map<Character, Integer> freqMap = new HashMap<>();
        // for (char ch : s.toCharArray()) {
        // freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        // }

        // // Step 2: Create buckets (index = frequency)
        // List<Character>[] buckets = new ArrayList[s.length() + 1];
        // for (int i = 0; i < buckets.length; i++) {
        // buckets[i] = new ArrayList<>();
        // }

        // // Step 3: Put characters into buckets
        // for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
        // buckets[entry.getValue()].add(entry.getKey());
        // }

        // // Step 4: Build result
        // StringBuilder sb = new StringBuilder();
        // for (int i = buckets.length - 1; i >= 0; i--) {
        // for (char ch : buckets[i]) {
        // sb.append(String.valueOf(ch).repeat(i));
        // }
        // }

        // return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";

        System.out.println(frequencySort(s));
    }
}
