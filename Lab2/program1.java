import java.util.*;

public class program1 {

    // Static variable to store the input array of N numbers
    static int[] numbersArray;

    // Static method to find the top K numbers with the highest occurrences
    public static void findTopKFrequent(int K) {
        // Create a map to store frequencies of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each number in the array
        for (int num : numbersArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue (max heap) to sort by frequency and value
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (b.getValue().equals(a.getValue())) {
                    return b.getKey() - a.getKey(); // Sort by number value if frequencies are the same
                }
                return b.getValue() - a.getValue(); // Sort by frequency in descending order
            }
        );

        // Add all entries from the frequency map to the max heap
        maxHeap.addAll(frequencyMap.entrySet());

        // Print the top K frequent numbers
        System.out.println("Top " + K + " numbers with the highest occurrences:");
        for (int i = 0; i < K; i++) {
            if (!maxHeap.isEmpty()) {
                Map.Entry<Integer, Integer> entry = maxHeap.poll();
                System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        // Example: Initialize the array of N numbers
        numbersArray = new int[]{4, 5, 6, 5, 4, 3, 6, 6, 6, 7, 8, 8, 8, 9};

        // Example: Find the top K frequent numbers, K = 3
        findTopKFrequent(3);
    }
}
