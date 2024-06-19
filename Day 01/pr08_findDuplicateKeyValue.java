import java.util.HashMap;
import java.util.Map;

public class pr08_findDuplicateKeyValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 5, 1, 1, 6, 7, 8, 2};

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Iterate through the array and count the occurrences of each element
        for (int element : array) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        // Iterate through the HashMap and print elements that have a count greater than 1
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
