import java.util.HashMap;
import java.util.Map;

public class AlphabetWarGame {

    private Map<Character, Integer> leftSideStrengths;
    private Map<Character, Integer> rightSideStrengths;

    // Default constructor with predefined strengths
    public AlphabetWarGame() {
        this.leftSideStrengths = new HashMap<>();
        this.rightSideStrengths = new HashMap<>();

        // Default strengths for the left side
        this.leftSideStrengths.put('w', 4);
        this.leftSideStrengths.put('p', 3);
        this.leftSideStrengths.put('b', 2);
        this.leftSideStrengths.put('s', 1);

        // Default strengths for the right side
        this.rightSideStrengths.put('m', 4);
        this.rightSideStrengths.put('q', 3);
        this.rightSideStrengths.put('d', 2);
        this.rightSideStrengths.put('z', 1);
    }

    // Overloaded constructor for customizable strengths
    public AlphabetWarGame(Map<Character, Integer> customLeftStrengths, Map<Character, Integer> customRightStrengths) {
        this.leftSideStrengths = customLeftStrengths;
        this.rightSideStrengths = customRightStrengths;
    }

    // Method to calculate winner from a single word
    public String alphabetWar(String word) {
        int leftScore = 0;
        int rightScore = 0;

        // Loop through each character in the word
        for (char letter : word.toCharArray()) {
            // Check if the character belongs to the left or right side and update the score
            if (leftSideStrengths.containsKey(letter)) {
                leftScore += leftSideStrengths.get(letter);
            } else if (rightSideStrengths.containsKey(letter)) {
                rightScore += rightSideStrengths.get(letter);
            }
        }

        // Determine the winner based on scores
        return determineWinner(leftScore, rightScore);
    }

    // Overloaded method to calculate winner from two words (left and right)
    public String alphabetWar(String leftWord, String rightWord) {
        int leftScore = 0;
        int rightScore = 0;

        // Calculate left side score
        for (char letter : leftWord.toCharArray()) {
            if (leftSideStrengths.containsKey(letter)) {
                leftScore += leftSideStrengths.get(letter);
            }
        }

        // Calculate right side score
        for (char letter : rightWord.toCharArray()) {
            if (rightSideStrengths.containsKey(letter)) {
                rightScore += rightSideStrengths.get(letter);
            }
        }

        // Determine the winner based on scores
        return determineWinner(leftScore, rightScore);
    }

    // Helper method to determine the winner
    private String determineWinner(int leftScore, int rightScore) {
        if (leftScore > rightScore) {
            return "Left side wins!";
        } else if (rightScore > leftScore) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        AlphabetWarGame game = new AlphabetWarGame();

        // Test cases
        System.out.println(game.alphabetWar("z"));           // Right side wins!
        System.out.println(game.alphabetWar("zdqmwpbs"));    // Let's fight again!
        System.out.println(game.alphabetWar("wwwwwwz"));     // Left side wins!
    }
}
