package codealphaproject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am a chatbot. How can I help you today?");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String response = getPatternMatchedResponse(userInput);
            System.out.println(response);
        }

        scanner.close();
    }

    private static String getPatternMatchedResponse(String userInput) {
        userInput = userInput.toLowerCase();

        if (Pattern.matches(".*(hello|hi).*", userInput)) {
            return "Hi there! How can I assist you?";
        } else if (Pattern.matches(".*how are you.*", userInput)) {
            return "I'm a chatbot, so I don't have feelings, but thanks for asking!";
        } else if (Pattern.matches(".*(your name|who are you).*", userInput)) {
            return "I'm an intelligent chatbot created to assist you!";
        } else if (Pattern.matches(".*bye.*", userInput)) {
            return "Goodbye! Take care!";
        } else {
            return "I'm sorry, I didn't understand that. Could you try asking in a different way?";
        }
    }
}
