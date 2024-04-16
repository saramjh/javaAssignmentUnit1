import java.util.Scanner;
// import Scanner library(Oracle and/or its affiliates, n.d.)  for getting the user's input

public class QuizProgram {
    // assign QuizProgram Java class

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // "scanner" is assigned as variable that data type is Scanner. this is for user's input
        int correctAnswers = 0;
        // assign 'correctAnswers' integer variable to store total score

        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A. Paris");
        System.out.println("B. London");
        System.out.println("C. Berlin");
        System.out.println("D. Madrid");
        // display quiz 1 part and notify options

        String answer1 = getValidAnswer(scanner);
        // getting user's input value with evaluating valid or not by "getValidAnswer()"

        if (answer1.equals("A")) {
            correctAnswers++;
        }
        // checking answer and if it corrects, + 1 in correctAnswer variable

        System.out.println("\nQuestion 2: What is the largest planet in our solar system?");
        System.out.println("A. Earth");
        System.out.println("B. Mars");
        System.out.println("C. Jupiter");
        System.out.println("D. Saturn");
        // display quiz 2 part and notify options

        String answer2 = getValidAnswer(scanner);
        // getting user's input value with evaluating valid or not by "getValidAnswer()"

        if (answer2.equals("C")) {
            correctAnswers++;
        }
        // checking answer and if it corrects, + 1 in correctAnswer variable

        System.out.println("\nQuestion 3: What is the largest ocean on Earth?");
        System.out.println("A. Atlantic Ocean");
        System.out.println("B. Indian Ocean");
        System.out.println("C. Arctic Ocean");
        System.out.println("D. Pacific Ocean");
        // display quiz 3 part and notify options

        String answer3 = getValidAnswer(scanner);
        // getting user's input value with evaluating valid or not by "getValidAnswer()"

        if (answer3.equals("D")) {
            correctAnswers++;
        }
        // checking answer and if it corrects, + 1 in correctAnswer variable

        System.out.println("\nQuestion 4: What is the smallest planet in our solar system?");
        System.out.println("A. Venus");
        System.out.println("B. Mercury");
        System.out.println("C. Mars");
        System.out.println("D. Pluto");
        // display quiz 4 part and notify options

        String answer4 = getValidAnswer(scanner);
        // getting user's input value with evaluating valid or not by "getValidAnswer()"

        if (answer4.equals("B")) {
            correctAnswers++;
        }
        // checking answer and if it corrects, + 1 in correctAnswer variable

        System.out.println("\nQuestion 5: What is the largest mammal on Earth?");
        System.out.println("A. African Elephant");
        System.out.println("B. Blue Whale");
        System.out.println("C. Hippopotamus");
        System.out.println("D. Giraffe");
        // display quiz 5 part and notify options

        String answer5 = getValidAnswer(scanner);
        // getting user's input value with evaluating valid or not by "getValidAnswer()"

        if (answer5.equals("B")) {
            correctAnswers++;
        }
        // checking answer and if it corrects, + 1 in correctAnswer variable

        int totalQuestions = 5;
        // to manipulate total score, assign a integer variable "totalQuestions"

        double score = (double) correctAnswers / totalQuestions * 100;
        // computing score variable as a double data type

        System.out.printf("\nYour final score is %.2f%%", score);
        // display final score with formatted output "System.out.printf", &.2f% means a two-digit decimal.
    }
    private static String getValidAnswer(Scanner scanner) {
        // assign function getValidAnswer to evaluate user's input value.
        while (true) {
            // while loop checking user's input value
            System.out.print("Enter your answer (A, B, C, D): ");
            // notify instruction to user how to input
            String answer = scanner.nextLine().toUpperCase();
            // making answer uppercase to compare with the correct before
            if (answer.matches("[A-D]")) {
                // checking answer it is in A,B,C,D or not by matches() method (GeeksforGeeks, 2023)
                return answer;
                // if it is right, return answer value to outside from if statement
            } else {
                // the other cases, notify instruction to user repeatedly
                System.out.println("Invalid input. Please enter one in A, B, C, D.");
            }
        }
    }
}