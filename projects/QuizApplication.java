import java.util.*;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Question {
    private String question;
    private List<String> options;
    private int correctOption;

    public Question(String question, List<String> options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

public class QuizApplication {
    private static List<User> users = new ArrayList<>();
    private static List<Question> questions = new ArrayList<>();
    private static Map<String, Integer> scores = new HashMap<>();

    public static void main(String[] args) {
        initializeUsers();
        initializeQuestions();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quiz App!");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        User currentUser = login(username, password);

        if (currentUser != null) {
            System.out.println("Login successful!");
            displayRules();

            int score = startQuiz();
            scores.put(currentUser.getUsername(), score);

            System.out.println("Quiz completed! Your score: " + score);

            // Display leaderboard
            displayLeaderboard();
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }

    private static void initializeUsers() {
        // Add sample users with usernames and passwords
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
    }

    private static void initializeQuestions() {
        // Add sample quiz questions with options and correct answers
        List<String> options1 = Arrays.asList("A", "B", "C", "D");
        questions.add(new Question("What is the capital of France?", options1, 2));

        List<String> options2 = Arrays.asList("Red", "Green", "Blue", "Yellow");
        questions.add(new Question("What color is a banana?", options2, 3));

        // Add more questions here
    }

    private static User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    private static void displayRules() {
        System.out.println("Quiz Rules:");
        System.out.println("1. You will be asked multiple-choice questions.");
        System.out.println("2. Choose the correct option by entering the corresponding letter.");
        System.out.println("3. Each correct answer earns you one point.");
        System.out.println("4. Your total score will be displayed at the end.");
        System.out.println("5. Good luck!");
    }

    private static int startQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            List<String> options = question.getOptions();

            for (int i = 0; i < options.size(); i++) {
                System.out.println((char) ('A' + i) + ". " + options.get(i));
            }

            System.out.print("Your answer: ");
            char userAnswer = scanner.next().charAt(0);
            int userChoice = userAnswer - 'A';

            if (userChoice == question.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + (char) ('A' + question.getCorrectOption()));
            }
        }

        return score;
    }

    private static void displayLeaderboard() {
        System.out.println("Leaderboard:");

        // Sort scores in descending order
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(scores.entrySet());
        sortedScores.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        for (int i = 0; i < sortedScores.size(); i++) {
            System.out.println(
                    (i + 1) + ". " + sortedScores.get(i).getKey() + ": " + sortedScores.get(i).getValue() + " points");
        }
    }
}