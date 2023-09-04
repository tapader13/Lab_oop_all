import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer
        int randomNumber = random.nextInt(); // Generates a random 32-bit integer
        System.out.println("Random integer: " + randomNumber);

        // Generate a random integer within a specific range (e.g., between 0 and 9)
        int randomInRange = random.nextInt(10); // Generates a random integer between 0 (inclusive) and 10 (exclusive)
        System.out.println("Random integer in range: " + randomInRange);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random double between 0.0 and 1.0: " + randomDouble);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDoubl = Math.random();
        System.out.println("Random double between 0.0 and 1.0: " + randomDoubl);

        // Generate a random double within a specific range (e.g., between 0.0 and 9.0)
        double min = 0.0;
        double max = 10.0;
        double randomInRang = min + (max - min) * Math.random();
        System.out.println("Random double in range: " + randomInRang);
    }
}
