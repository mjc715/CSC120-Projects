import java.util.Scanner;
public class IAm {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String outputString = "The qualities are";
        String userInput;

        System.out.println("Please enter sentences, . to end.");
        userInput = keyboard.nextLine();

        while (userInput.charAt(0) != '.') {
            if (userInput.startsWith("I am")) {
                outputString = outputString + userInput.substring(4) + ",";
            }
            userInput = keyboard.nextLine();
        }

        System.out.println(outputString);

    }
}