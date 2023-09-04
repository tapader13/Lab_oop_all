import java.util.HashMap;
import java.util.Map;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class dup {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 5, 6, 4, 7 };

        // Create a HashMap to store elements and their counts
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Iterate through the array and update the element count in the map
        for (int element : arr) {
            // If the element is already in the map, increment its count
            if (elementCountMap.containsKey(element)) {
                int count = elementCountMap.get(element);
                elementCountMap.put(element, count + 1);
            } else {
                // If the element is not in the map, add it with count 1
                elementCountMap.put(element, 1);
            }
        }
        try {
            for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    throw new DuplicateNumberException("Duplicate number found: " + entry.getKey());
                    // System.out.println("Element with multiple occurrences: " + entry.etKey());
                }
            }

        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter valid integers.");
        } catch (DuplicateNumberException e) {
            System.err.println(e.getMessage());
        }

    }
}
